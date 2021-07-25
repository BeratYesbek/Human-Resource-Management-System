package com.beratyesbek.hrms.core;

import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;

public class SpringBootQueries {
    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,e.imageUrl,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.maxSalary,j.minSalary,j.applicationDeadline,j.approve)" +
            "From Employer e Inner Join e.jobAdvertisements j";

    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_BY_EMPLOYER_ID_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,e.imageUrl,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.maxSalary,j.minSalary,j.applicationDeadline,j.approve)" +
            "From Employer e Inner Join e.jobAdvertisements j Where e.employerId = employerId";

    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_BY_ID_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,e.imageUrl,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.maxSalary,j.minSalary,j.applicationDeadline,j.approve)" +
            "From Employer e Inner Join e.jobAdvertisements j on j.jobAdvertisementId = id ";

}
