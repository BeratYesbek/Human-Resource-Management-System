package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.*;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IJobSeekerDao;
import com.beratyesbek.hrms.entities.concretes.*;
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
    private ILanguageService languageService;
    private ICoverLetterService coverLetterService;


    @Autowired
    public JobSeekerManager(IJobSeekerDao jobSeekerDao,
                            IAbilityService abilityService,
                            IExperienceService experienceService,
                            ISocialMediaService socialMediaService,
                            IEducationService educationService,
                            ILanguageService languageService,
                            ICoverLetterService coverLetterService

    ) {
        this.abilityService = abilityService;
        this.educationService = educationService;
        this.experienceService = experienceService;
        this.socialMediaService = socialMediaService;
        this.jobSeekerDao = jobSeekerDao;
        this.languageService = languageService;
        this.coverLetterService = coverLetterService;
    }

    @Override
    public Result add(JobSeeker entity) {
        JobSeeker jobSeeker = jobSeekerDao.save(entity);
        Integer id = jobSeeker.getId();
        return new SuccessResult(id.toString());
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
    public  DataResult<CvDto>  getCvByJobSeekerId(int id) {

        abilityService.getByJobSeekerId(id).getData();
        educationService.getByJobSeekerId(id).getData();
        experienceService.getByJobSeekerId(id);
        socialMediaService.getByJobSeekerId(id);

       CvDto cvDto = new CvDto(null,
                abilityService.getByJobSeekerId(id).getData(),
                experienceService.getByJobSeekerId(id).getData(),
                educationService.getByJobSeekerId(id).getData(),
                languageService.getByJobSeekerId(id).getData(),
                socialMediaService.getByJobSeekerId(id).getData(),
                coverLetterService.getByJobSeekerId(id).getData()
               );

        return new SuccessDataResult(cvDto);
    }
}
