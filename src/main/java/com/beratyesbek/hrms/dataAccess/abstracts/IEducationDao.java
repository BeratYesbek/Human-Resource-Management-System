package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDao extends JpaRepository<Education,Integer> {
}
