package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IExperienceService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Employer;
import com.beratyesbek.hrms.entities.concretes.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
@CrossOrigin("http://localhost:3000/")

public class ExperienceController {

    private IExperienceService experienceService;

    @Autowired
    public ExperienceController(IExperienceService experienceService) {
        this.experienceService = experienceService;
    }


    @GetMapping("/getAll")
    private DataResult<List<Experience>> getAll() {
        return this.experienceService.getAll();
    }

    @GetMapping("/getById")
    private DataResult getById(@RequestBody int id) {
        return experienceService.getById(id);
    }


    @PostMapping("/add")
    private Result add(@RequestBody Experience experience) {
        return experienceService.add(experience);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody Experience experience) {
        return experienceService.delete(experience);
    }


}
