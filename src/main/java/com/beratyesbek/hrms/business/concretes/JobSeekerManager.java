package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IJobSeekerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IJobSeekerDao;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobSeekerManager implements IJobSeekerService {

    private IJobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(IJobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result add(JobSeeker entity) {
        return null;
    }

    @Override
    public Result update(JobSeeker entity) {
        return null;
    }

    @Override
    public Result delete(JobSeeker entity) {
        return null;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getById(int id) {
        return null;
    }
}
