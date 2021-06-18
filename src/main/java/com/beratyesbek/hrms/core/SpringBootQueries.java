package com.beratyesbek.hrms.core;

import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;

public class SpringBootQueries {
    public static final String JOB_ADVERTISEMENT_WITH_EMPLOYER_QUERY = "Select new com.beratyesbek.hrms.entities.dtos.JobAdvertisementWithEmployerDto" +
            "(j.jobAdvertisementId ,e.employerId,e.companyName,j.location,j.jobDescription,j.jobPosition,j.numberOfPosition,j.salaryScale,j.applicationDeadline)" +
            "From Employer e Inner Join e.jobAdvertisements j";

    public static final String ABILITY_QUERY = "From Ability where jobSeeker.id =:id";

    public static final String EDUCATION_QUERY = "From Education where jobSeeker.id =:id";

    public static final String EXPERIENCE_QUERY = "From Experience where jobSeeker.id =:id";

    public static final String LANGUAGE_QUERY = "From Language where jobSeeker.id =:id";

    public static final String SOCIAL_MEDIA_QUERY = "From SocialMedia where jobSeeker.id =:id";




}
