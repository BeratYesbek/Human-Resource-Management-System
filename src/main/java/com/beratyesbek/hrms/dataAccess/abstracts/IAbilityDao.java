package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.entities.concretes.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbilityDao extends JpaRepository<Ability,Integer> {


}
