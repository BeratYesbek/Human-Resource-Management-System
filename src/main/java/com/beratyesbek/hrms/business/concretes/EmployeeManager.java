package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IEmployeeService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IEmployeeDao;
import com.beratyesbek.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeManager implements IEmployeeService {

    private IEmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Override
    public Result add(Employee entity) {
        return null;
    }

    @Override
    public Result update(Employee entity) {
        return null;
    }

    @Override
    public Result delete(Employee entity) {
        return null;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult(this.employeeDao.findAll());
    }

    @Override
    public DataResult<Employee> getById(int id) {
        return null;
    }
}
