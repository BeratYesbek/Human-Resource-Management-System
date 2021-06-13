package com.beratyesbek.hrms.api;


import com.beratyesbek.hrms.business.abstracts.IEmployeeService;
import com.beratyesbek.hrms.business.abstracts.IEmployerService;
import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.dataAccess.abstracts.IEmployeeDao;
import com.beratyesbek.hrms.entities.concretes.Education;
import com.beratyesbek.hrms.entities.concretes.Employee;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getById")
    private DataResult getById(@RequestBody int id){
        return employeeService.getById(id);
    }

    @PostMapping("/add")
    private Result add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @PostMapping("/delete")
    private Result delete(@RequestBody Employee employee){
        return employeeService.delete(employee);
    }
}
