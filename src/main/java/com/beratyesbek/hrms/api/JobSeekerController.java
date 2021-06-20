package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.*;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;


@RestController
@RequestMapping("/api/jobSeekers")
@CrossOrigin("http://localhost:3000/")
public class JobSeekerController {

    private IJobSeekerService jobSeekerService;


    @Autowired
    public JobSeekerController(IJobSeekerService jobSeekerService) {

        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getAll")
    private DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }


    @GetMapping("/getById")
    private DataResult getById(int id) {
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

    @GetMapping("/getCv")
    private DataResult getCvByJobSeekerId(int id){
        return  jobSeekerService.getCvByJobSeekerId(id);
    }

}
