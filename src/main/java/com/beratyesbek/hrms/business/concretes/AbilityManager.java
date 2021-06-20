package com.beratyesbek.hrms.business.concretes;

import com.beratyesbek.hrms.business.abstracts.IAbilityService;
import com.beratyesbek.hrms.core.utilities.*;
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
    public DataResult<Ability> getById(int ability_id) {
        Object data = abilityDao.findById(ability_id);
        if (data != null){
            System.out.println("data ");
            return new SuccessDataResult(data);
        }
        return new ErrorDataResult(null);
    }

    @Override
    public DataResult<List<Ability>> getByJobSeekerId(int id) {
        return new SuccessDataResult(abilityDao.getByJobSeeker_Id(id));
    }
}
