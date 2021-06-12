package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

import java.util.List;

public interface IJobAdvertisementService extends IServiceRepository<JobAdvertisement>{
    DataResult<List<JobAdvertisementWithEmployerDto>> getAllJobAdvertisementDetail();
}
