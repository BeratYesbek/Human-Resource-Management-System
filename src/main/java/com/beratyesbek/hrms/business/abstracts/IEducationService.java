package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Education;

import java.util.List;

public interface IEducationService extends IServiceRepository<Education>{
    DataResult<List<Education>> getByJobSeekerId(int id);

}
