package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IJobAdvertisementService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController  {

    private IJobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(IJobAdvertisementService jobAdvertisementService) {

        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/getAll")
    private DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllDetail")
    private DataResult<List<JobAdvertisement>> getAllDetail(){
        return this.jobAdvertisementService.getAllJobAdvertisementDetail();
    }
}
