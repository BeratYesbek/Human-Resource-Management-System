package com.beratyesbek.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_advertisement_id")
    private int jobAdvertisementId;

    @Column(name = "location")
    private String location;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "job_position")
    private String jobPosition;

    @Column(name = "number_of_position")
    private int numberOfPosition;

    @Column(name = "maxSalary")
    private int maxSalary;

    @Column(name = "minSalary")
    private int minSalary;

    @Column(name = "application_deadline")
    private Date applicationDeadline;

    @Column(name = "approve")
    private Boolean approve;


    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;


    @JsonIgnore
    @OneToMany(mappedBy = "jobAdvertisements")
    private List<Application> applications;

}
