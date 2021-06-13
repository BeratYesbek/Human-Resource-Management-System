package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IJobSeekerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JobSeekerController {

    private IJobSeekerService jobSeekerService;

    public JobSeekerController(IJobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getAll")
    private DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }


    @GetMapping("/getById")
    private DataResult getById(@RequestBody int id) {
        return jobSeekerService.getById(id);
    }

    @PostMapping("/add")
    private Result add(@RequestBody JobSeeker jobSeeker) {
        return jobSeekerService.add(jobSeeker);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody JobSeeker jobSeeker) {
        return jobSeekerService.delete(jobSeeker);
    }
}
