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
            return new SuccessResult("Job advertisement was added successfully");
        }
            return new ErrorResult("An error occurred during the operation");
    }

    @Override
    public Result update(JobAdvertisement entity) {
         jobAdvertisementDao.save(entity);
         return new SuccessResult("Data was updated successfully");
    }

    @Override
    public Result delete(JobAdvertisement entity) {
        jobAdvertisementDao.delete(entity);
        return new SuccessResult("Job advertisement was deleted successfully");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult(this.jobAdvertisementDao.findAll());
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return new SuccessDataResult(jobAdvertisementDao.findById(id));
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerDto>> getAllJobAdvertisementDetail() {
        return new SuccessDataResult(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails()) ;
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementDetailById(int id) {
        return new SuccessDataResult(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetailsById(id));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getJobAdvertisementDetailByEmployerId(int employerId) {
        return new SuccessDataResult(this.jobAdvertisementDao.getByEmployer_EmployerId(employerId));
    }

}
