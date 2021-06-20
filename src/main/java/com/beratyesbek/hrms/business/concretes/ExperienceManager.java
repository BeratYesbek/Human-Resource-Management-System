package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IExperienceService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IExperienceDao;
import com.beratyesbek.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements IExperienceService {

    private IExperienceDao experienceDao;

    @Autowired
    public ExperienceManager(IExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @Override
    public Result add(Experience entity) {
        experienceDao.save(entity);
        return  new SuccessResult("Experience was added successfully");
    }

    @Override
    public Result update(Experience entity) {
        return null;
    }

    @Override
    public Result delete(Experience entity) {
        experienceDao.delete(entity);
        return new SuccessResult("Experience was deleted successfully");
    }

    @Override
    public DataResult<List<Experience>> getAll() {
        return new SuccessDataResult(experienceDao.findAll());
    }

    @Override
    public DataResult<Experience> getById(int id) {
        return new SuccessDataResult(experienceDao.findById(id));
    }

    @Override
    public DataResult<List<Experience>> getByJobSeekerId(int id) {
        return new SuccessDataResult(experienceDao.getByJobSeeker_Id(id));
    }
}
