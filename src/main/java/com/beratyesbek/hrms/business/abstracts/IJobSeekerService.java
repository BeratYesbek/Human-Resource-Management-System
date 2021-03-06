package com.beratyesbek.hrms.business.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import com.beratyesbek.hrms.entities.dtos.CvDto;

import java.util.ArrayList;
import java.util.List;

public interface IJobSeekerService extends IServiceRepository<JobSeeker>{

    DataResult<CvDto> getCvByJobSeekerId(int id);
}
