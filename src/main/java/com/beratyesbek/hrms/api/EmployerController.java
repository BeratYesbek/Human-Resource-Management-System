package com.beratyesbek.hrms.api;

import com.beratyesbek.hrms.business.abstracts.IEmployerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

    private IEmployerService employerService;

    @Autowired
    public EmployerController(IEmployerService employerService){

        this.employerService = employerService;
    }

    @GetMapping("/getAll")
    private DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }
}
