package com.beratyesbek.hrms.core;

import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;

public class SpringBootQueries {
    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_QUERIES = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisement_id ,e.companyName,j.location,j.jobDescription,j.position,j.numberOfPosition,j.salaryScale,j.applicationDeadline)" +
            "Form Employer e Inner Join e.jobAdvertisements j";
}
