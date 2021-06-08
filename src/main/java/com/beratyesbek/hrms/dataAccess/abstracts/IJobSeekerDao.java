package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.utilities.DataResult;
import com.beratyesbek.hrms.entities.concretes.Employer;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface IJobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    List<JobSeeker> findAll();

}
