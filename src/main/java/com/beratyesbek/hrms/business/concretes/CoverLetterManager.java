package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.ICoverLetterService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.ICoverLetterDao;
import com.beratyesbek.hrms.entities.concretes.CoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverLetterManager implements ICoverLetterService {

    private ICoverLetterDao coverLetterDao;

    @Autowired
    public CoverLetterManager(ICoverLetterDao coverLetterDao) {
        this.coverLetterDao = coverLetterDao;
    }

    @Override
    public Result add(CoverLetter entity) {
         coverLetterDao.save(entity);
         return new SuccessResult();
    }

    @Override
    public Result update(CoverLetter entity) {
        return null;
    }

    @Override
    public Result delete(CoverLetter entity) {
        coverLetterDao.delete(entity);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<CoverLetter>> getAll() {
        return new SuccessDataResult(coverLetterDao.findAll());
    }

    @Override
    public DataResult<CoverLetter> getById(int id) {
        return new SuccessDataResult(coverLetterDao.findById(id));
    }

    @Override
    public DataResult<CoverLetter> getByJobSeekerId(int id) {
        return new SuccessDataResult(coverLetterDao.getByJobSeeker_Id(id));
    }

}
