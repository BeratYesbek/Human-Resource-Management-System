package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/educations")
public class EducationController {

    private IEducationService educationService;

    @Autowired
    public EducationController(IEducationService educationService) {
        this.educationService = educationService;
    }
}
