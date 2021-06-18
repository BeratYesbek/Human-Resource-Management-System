package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.*;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IJobSeekerDao;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import com.beratyesbek.hrms.entities.dtos.CvDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobSeekerManager implements IJobSeekerService {

    private IJobSeekerDao jobSeekerDao;
    private IAbilityService abilityService;
    private IExperienceService experienceService;
    private ISocialMediaService socialMediaService;
    private IEducationService educationService;



    @Autowired
    public JobSeekerManager(IJobSeekerDao jobSeekerDao,
                            IAbilityService abilityService,
                            IExperienceService experienceService,
                            ISocialMediaService socialMediaService,
                            IEducationService educationService

                            ) {
        this.abilityService = abilityService;
        this.educationService = educationService;
        this.experienceService = experienceService;
        this.socialMediaService = socialMediaService;
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result add(JobSeeker entity) {
        jobSeekerDao.save(entity);
        return new SuccessResult("JobSeeker was added successfully");
    }

    @Override
    public Result update(JobSeeker entity) {
        return null;
    }

    @Override
    public Result delete(JobSeeker entity) {
         jobSeekerDao.delete(entity);
        return new SuccessResult("Job seeker was deleted successfully");

    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getById(int id) {
        return new SuccessDataResult(jobSeekerDao.findById(id));
    }



    @Override
    public DataResult<List<CvDto>> getCvByJobSeekerId(int id) {

        CvDto cvDto = new CvDto();

        cvDto.setAbilities(abilityService.getByJobSeekerId(id).getData());
        cvDto.setEducations(educationService.getByJobSeekerId(id).getData());
        cvDto.setExperiences(experienceService.getByJobSeekerId(id).getData());
        cvDto.setSocialMedia(socialMediaService.getByJobSeekerId(id).getData());


        return new SuccessDataResult(cvDto);
    }
}
