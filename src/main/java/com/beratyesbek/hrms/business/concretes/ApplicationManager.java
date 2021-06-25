package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IApplicationService;
import com.beratyesbek.hrms.business.abstracts.IJobAdvertisementService;
import com.beratyesbek.hrms.business.abstracts.IJobSeekerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IApplicationDao;
import com.beratyesbek.hrms.dataAccess.abstracts.IJobSeekerDao;
import com.beratyesbek.hrms.entities.concretes.Application;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.dtos.ApplicationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationManager implements IApplicationService {


    private IApplicationDao applicationDao;
    private IJobAdvertisementService  jobAdvertisementService;
    private IJobSeekerService jobSeekerService;

    @Autowired
    public ApplicationManager(IApplicationDao applicationDao,
                              IJobAdvertisementService jobAdvertisementService,
                              IJobSeekerService jobSeekerService) {
        this.applicationDao = applicationDao;
        this.jobAdvertisementService = jobAdvertisementService;
        this.jobSeekerService = jobSeekerService;
    }

    @Override
    public Result add(Application entity) {
        return null;
    }

    @Override
    public Result update(Application entity) {
        return null;
    }

    @Override
    public Result delete(Application entity) {
        return null;
    }

    @Override
    public DataResult<List<Application>> getAll() {
        return null;
    }

    @Override
    public DataResult<Application> getById(int id) {
        return null;
    }

    @Override
    public DataResult<List<Application>>getByJobSeeker_Id(int id) {

       return new SuccessDataResult(applicationDao.getByJobSeeker_Id(id));
    }
}
