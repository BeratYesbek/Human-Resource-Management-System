package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAbilityDao extends JpaRepository<Ability,Integer> {

    List<Ability> getByJobSeeker_Id(int id);



}
