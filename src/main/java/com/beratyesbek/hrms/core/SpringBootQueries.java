package com.beratyesbek.hrms.core;

import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;

public class SpringBootQueries {
    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.maxSalary,j.minSalary,j.applicationDeadline,j.approve)" +
            "From Employer e Inner Join e.jobAdvertisements j";

    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_BY_ID_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.maxSalary,j.minSalary,j.applicationDeadline,j.approve)" +
            "From Employer e Inner Join e.jobAdvertisements j on j.jobAdvertisementId = id ";

    public static final String APPLICATION_DETAILS_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.ApplicationDto"+"(a.application_id," +
            " a.applicationDate, s.jobSeekerId, j.jobAdvertisementId,j.location,j.jobDescription,j.jobPosition)"+
            "From JobAdvertisement j Inner Join a.jobAdvertisements";
}
