package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEducationDao extends JpaRepository<Education,Integer> {

    List<Ability> getByJobSeekerId(int id);
}
