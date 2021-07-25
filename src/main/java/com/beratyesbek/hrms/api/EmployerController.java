package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IEmployerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Employee;
import com.beratyesbek.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/employers")
public class EmployerController {

    private IEmployerService employerService;

    @Autowired
    public EmployerController(IEmployerService employerService) {

        this.employerService = employerService;
    }

    @GetMapping("/getAll")
    private DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @GetMapping("/getById")
    private DataResult getById( int id) {
        return employerService.getById(id);
    }


    @PostMapping("/add")
    private Result add(@RequestBody Employer employer) {
        return employerService.add(employer);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody Employer employer) {
        return employerService.delete(employer);
    }

}
