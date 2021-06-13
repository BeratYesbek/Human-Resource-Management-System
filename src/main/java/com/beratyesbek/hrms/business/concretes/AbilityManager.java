package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.core.utilities.SuccessDataResult;
import com.beratyesbek.hrms.core.utilities.SuccessResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IAbilityDao;
import com.beratyesbek.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityManager implements IAbilityService {

    private IAbilityDao abilityDao;

    @Autowired
    public AbilityManager(IAbilityDao abilityDao) {
        this.abilityDao = abilityDao;
    }

    @Override
    public Result add(Ability entity) {
        this.abilityDao.save(entity);
        return new SuccessResult("Ability was added successfully");
    }

    @Override
    public Result update(Ability entity) {
        return null;
    }

    @Override
    public Result delete(Ability entity) {
         abilityDao.delete(entity);
         return new SuccessResult("Ability was deleted successfully");
    }

    @Override
    public DataResult<List<Ability>> getAll() {
        return new SuccessDataResult(abilityDao.findAll());
    }

    @Override
    public DataResult<Ability> getById(int id) {
        return new SuccessDataResult(abilityDao.findById(id));
    }
}
