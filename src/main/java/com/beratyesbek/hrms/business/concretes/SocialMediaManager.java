package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.ISocialMediaService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.ISocialMediaDao;
import com.beratyesbek.hrms.entities.concretes.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialMediaManager implements ISocialMediaService {

    private ISocialMediaDao socialMediaDao;

    @Autowired
    public SocialMediaManager(ISocialMediaDao socialMediaDao) {
        this.socialMediaDao = socialMediaDao;
    }

    @Override
    public Result add(SocialMedia entity) {
        socialMediaDao.save(entity);
        return new SuccessResult("Social media was added successfully");
    }

    @Override
    public Result update(SocialMedia entity) {
        return null;
    }

    @Override
    public Result delete(SocialMedia entity) {
        socialMediaDao.delete(entity);
        return new SuccessResult("Social media was deleted successfully");
    }

    @Override
    public DataResult<List<SocialMedia>> getAll() {
        return new SuccessDataResult(this.socialMediaDao.findAll());
    }

    @Override
    public DataResult<SocialMedia> getById(int id) {
        return new SuccessDataResult(socialMediaDao.findById(id));
    }

    @Override
    public DataResult<List<SocialMedia>> getByJobSeekerId(int id) {
        return new SuccessDataResult(socialMediaDao.getByJobSeeker_Id(id));
    }
}
