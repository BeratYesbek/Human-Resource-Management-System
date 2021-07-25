package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Application;
import com.beratyesbek.hrms.entities.dtos.ApplicationDto;

import java.util.List;

public interface IApplicationService extends IServiceRepository<Application>{
    DataResult<List<Application>> getByJobSeeker_Id(int id);
    DataResult<List<Application>> getApplicationDetailByJobAdvertisementId(int jobAdvertisementId);

}
