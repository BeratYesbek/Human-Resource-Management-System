package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IEducationService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/educations")
public class EducationController {

    private IEducationService educationService;

    @Autowired
    public EducationController(IEducationService educationService) {
        this.educationService = educationService;
    }

    @PostMapping("/add")
    private Result add(@RequestBody Education education) {
        return educationService.add(education);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody Education education) {
        return educationService.delete(education);
    }

    @GetMapping("/getAll")
    private DataResult getAll() {
        return educationService.getAll();
    }

    @GetMapping("/getById")
    private DataResult getById( int id) {
        return educationService.getById(id);
    }
}
