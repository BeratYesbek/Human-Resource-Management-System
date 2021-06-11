package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IExperienceService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
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
        return null;
    }

    @Override
    public Result update(Experience entity) {
        return null;
    }

    @Override
    public Result delete(Experience entity) {
        return null;
    }

    @Override
    public DataResult<List<Experience>> getAll() {
        return null;
    }

    @Override
    public DataResult<Experience> getById(int id) {
        return null;
    }
}
