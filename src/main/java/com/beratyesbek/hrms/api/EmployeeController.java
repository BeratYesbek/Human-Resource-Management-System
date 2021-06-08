package com.beratyesbek.hrms.api;


import com.beratyesbek.hrms.business.abstracts.IEmployeeService;
import com.beratyesbek.hrms.business.abstracts.IEmployerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.dataAccess.abstracts.IEmployeeDao;
import com.beratyesbek.hrms.entities.concretes.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {



    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAll")
    private DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }
}
