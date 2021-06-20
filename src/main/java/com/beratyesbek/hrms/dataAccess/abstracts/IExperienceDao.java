package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.Ability;
import com.beratyesbek.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IExperienceDao extends JpaRepository<Experience,Integer> {

    List<Experience> getByJobSeeker_Id(int id);
}
