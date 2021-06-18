package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Ability;

import java.util.List;

public interface IAbilityService extends IServiceRepository<Ability>{
  DataResult<List<Ability>> getByJobSeekerId(int id);

}
