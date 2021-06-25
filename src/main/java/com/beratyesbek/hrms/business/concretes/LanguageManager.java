package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.ILanguageService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.ILanguageDao;
import com.beratyesbek.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements ILanguageService {

    private ILanguageDao languageDao;

    @Autowired
    public LanguageManager(ILanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(Language entity) {
        languageDao.save(entity);
        return new SuccessResult("Language has been added successfully");
    }

    @Override
    public Result update(Language entity) {
        return null;
    }

    @Override
    public Result delete(Language entity) {
        languageDao.delete(entity);
        return new SuccessResult("Language has been deleted successfully");
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult(languageDao.findAll());
    }

    @Override
    public DataResult<Language> getById(int id) {
        return new SuccessDataResult(languageDao.findById(id));
    }

    @Override
    public DataResult<List<Language>> getByJobSeekerId(int id) {
        return new SuccessDataResult(languageDao.getByJobSeeker_Id(id));
    }
}
