package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "educations")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private int educationId;

    @Column(name = "job_seeker_id")
    private int jobSeekerId;

    @Column(name = "graduate_year")
    private int [] graduateYear;

    @Column(name = "school_name")
    private String [] schoolName;



}
