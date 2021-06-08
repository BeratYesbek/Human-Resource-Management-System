package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Employee;
import com.beratyesbek.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface IEmployerDao extends JpaRepository<Employer,Integer> {

    List<Employer> findAll();

}
