package com.beratyesbek.hrms.entities.dtos;

import com.beratyesbek.hrms.entities.concretes.Application;
import com.beratyesbek.hrms.entities.concretes.Employer;
import com.beratyesbek.hrms.entities.concretes.JobAdvertisement;
import com.beratyesbek.hrms.entities.concretes.JobSeeker;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ApplicationDto {
    @JsonIgnore
    private List<Application> application;
    private List<JobAdvertisement>  jobAdvertisements;
    private List<Employer> employers;
    private List<JobSeeker> jobSeekers;
}
