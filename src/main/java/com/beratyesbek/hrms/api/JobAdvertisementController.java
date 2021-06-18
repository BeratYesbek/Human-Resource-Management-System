package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IJobAdvertisementService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Experience;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {

    private IJobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(IJobAdvertisementService jobAdvertisementService) {

        this.jobAdvertisementService = jobAdvertisementService;
    }


    @GetMapping("/getAll")
    private DataResult<List<JobAdvertisement>> getAll() {
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllDetail")
    private DataResult<List<JobAdvertisementWithEmployerDto>> getAllDetail() {
        return this.jobAdvertisementService.getAllJobAdvertisementDetail();
    }

    @GetMapping("/getById")
    private DataResult getById( int id) {
        return jobAdvertisementService.getById(id);
    }


    @PostMapping("/add")
    private Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return jobAdvertisementService.add(jobAdvertisement);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody JobAdvertisement jobAdvertisement) {
        return jobAdvertisementService.delete(jobAdvertisement);
    }
}
