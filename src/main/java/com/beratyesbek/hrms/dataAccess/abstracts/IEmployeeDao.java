package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.core.utilities.Result;
import com.beratyesbek.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeDao extends JpaRepository<Employee,Integer> {

    List<Employee> findAll();




}
