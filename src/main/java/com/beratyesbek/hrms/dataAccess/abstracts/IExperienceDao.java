package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExperienceDao extends JpaRepository<Experience,Integer> {
}
