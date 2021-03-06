package com.beratyesbek.hrms.dataAccess.abstracts;

import com.beratyesbek.hrms.core.SpringBootQueries;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IJobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> findAll();
    @Query(SpringBootQueries.JOB_ADVERTISEMENT_WITH_EMPLOYER_QUERY)
    List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails();

    @Query(SpringBootQueries.JOB_ADVERTISEMENT_WITH_EMPLOYER_BY_ID_QUERY)
    JobAdvertisementWithEmployerDto getJobAdvertisementWithEmployerDetailsById(int id);

    @Query(SpringBootQueries.JOB_ADVERTISEMENT_WITH_EMPLOYER_BY_EMPLOYER_ID_QUERY)
    List<JobAdvertisementWithEmployerDto> getJobAdvertisementByEmployerId(int employerId);

    List<JobAdvertisement> getByEmployer_EmployerId(int employerId);
}
