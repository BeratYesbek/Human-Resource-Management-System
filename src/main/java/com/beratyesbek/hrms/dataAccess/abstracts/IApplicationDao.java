package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.Application;
import com.beratyesbek.hrms.entities.dtos.ApplicationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IApplicationDao extends JpaRepository<Application,Integer> {


    List<Application> getByJobSeeker_Id(int id);

    List<Application> getByJobAdvertisements_JobAdvertisementId(int jobAdvertisementId);



}
