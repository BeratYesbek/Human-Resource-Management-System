package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IEducationService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
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
        return null;
    }

    @Override
    public Result update(Education entity) {
        return null;
    }

    @Override
    public Result delete(Education entity) {
        return null;
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return null;
    }

    @Override
    public DataResult<Education> getById(int id) {
        return null;
    }
}
