package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.SocialMedia;

import java.util.List;

public interface ISocialMediaService extends IServiceRepository<SocialMedia>{
    DataResult<List<SocialMedia>> getByJobSeekerId(int id);

}
