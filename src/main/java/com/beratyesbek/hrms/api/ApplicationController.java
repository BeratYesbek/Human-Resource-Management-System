package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IApplicationService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Application;
import com.beratyesbek.hrms.entities.dtos.ApplicationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private IApplicationService applicationService;

    @Autowired
    public ApplicationController(IApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/getAllDetailByJobSeekerId")
    private DataResult<List<Application>> getAllDetailByJobSeekerId(int id){
        return applicationService.getByJobSeeker_Id(id);
    }
}
