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

    private int companyId;

    private String companyName;

    private String location;

    private String jobDescription;

    private String jobPosition;

    private int numberOfPosition;

    private int[] salaryScale;

    private Date applicationDeadline;
}
