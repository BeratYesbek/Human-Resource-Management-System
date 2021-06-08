package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IJobSeekerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerController {

    private IJobSeekerService jobSeekerService;

    public JobSeekerController(IJobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    private DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }
}
