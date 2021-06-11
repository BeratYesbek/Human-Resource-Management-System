package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface IJobAdvertisementService extends IServiceRepository<JobAdvertisement>{
    DataResult<List<JobAdvertisement>> getAllJobAdvertisementDetail();
}
