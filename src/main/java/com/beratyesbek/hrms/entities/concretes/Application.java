package com.beratyesbek.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "applications")
//@EqualsAndHashCode(callSuper = false)
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private int application_id;

    @ManyToOne
    @JoinColumn(name = "id")
    private JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "job_advertisement_id")
    private  JobAdvertisement jobAdvertisements;

    @Column(name = "application_date")

    private Date applicationDate;

}
