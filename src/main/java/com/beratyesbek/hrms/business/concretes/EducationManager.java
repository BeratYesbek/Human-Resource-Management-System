package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IEducationService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IEducationDao;
import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationManager implements IEducationService {

    private IEducationDao educationDao;

    @Autowired
    public EducationManager(IEducationDao educationDao) {
        this.educationDao = educationDao;
    }

    @Override
    public Result add(Education entity) {
        educationDao.save(entity);
        return new SuccessResult("Education was added successfully");
    }

    @Override
    public Result update(Education entity) {
        return null;
    }

    @Override
    public Result delete(Education entity) {
         educationDao.delete(entity);
         return new SuccessResult();
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult(educationDao.findAll());
    }

    @Override
    public DataResult<Education> getById(int id) {
        return new SuccessDataResult(educationDao.getById(id));
    }

    @Override
    public DataResult<List<Education>> getByJobSeekerId(int id) {
        return new SuccessDataResult(educationDao.getByJobSeekerId(id));
    }
}
