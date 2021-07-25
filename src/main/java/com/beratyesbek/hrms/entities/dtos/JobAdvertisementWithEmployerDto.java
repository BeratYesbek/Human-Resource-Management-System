package com.beratyesbek.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementWithEmployerDto {

    private int jobAdvertisement_id;

    private int employerId;

    private String companyName;

    private String imageUrl;

    private String location;

    private String jobDescription;

    private String jobPosition;

    private int numberOfPosition;

    private int maxSalary;

    private int minSalary;

    private Date applicationDeadline;

    private Boolean approve;

}
