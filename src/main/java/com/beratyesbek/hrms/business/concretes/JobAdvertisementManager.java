package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IJobAdvertisementService;
import com.beratyesbek.hrms.core.utilities.*;
import com.beratyesbek.hrms.dataAccess.abstracts.IJobAdvertisementDao;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements IJobAdvertisementService {

    private IJobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(IJobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public Result add(JobAdvertisement entity) {
        Object data =  this.jobAdvertisementDao.save(entity);
        if (data != null){
            return new SuccessResult("User was added successfully");
        }
            return new ErrorResult("An error occurred during the operation");
    }

    @Override
    public Result update(JobAdvertisement entity) {
        return null;
    }

    @Override
    public Result delete(JobAdvertisement entity) {
        return null;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult(this.jobAdvertisementDao.findAll());
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return null;
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerDto>> getAllJobAdvertisementDetail() {
        return new SuccessDataResult(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails()) ;
    }

}
