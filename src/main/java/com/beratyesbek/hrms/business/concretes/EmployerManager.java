package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IEmployerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IEmployerDao;
import com.beratyesbek.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployerManager implements IEmployerService {

    private IEmployerDao employerDao;

    @Autowired
    public EmployerManager(IEmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer entity) {
         employerDao.save(entity);
        return new SuccessResult("Employer was added successfully");
    }

    @Override
    public Result update(Employer entity) {
        return null;
    }

    @Override
    public Result delete(Employer entity) {
        employerDao.delete(entity);
        return new SuccessResult("Employer was deleted successfully");

    }

    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult(employerDao.findAll());
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return new SuccessDataResult(employerDao.findById(id));
    }
}
