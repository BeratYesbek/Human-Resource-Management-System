package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Experience;

import java.util.List;

public interface IExperienceService extends IServiceRepository<Experience>{
    DataResult<List<Experience>> getByJobSeekerId(int id);

}
