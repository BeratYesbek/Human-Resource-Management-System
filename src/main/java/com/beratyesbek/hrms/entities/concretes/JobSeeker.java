package com.beratyesbek.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "job_seekers")
public class JobSeeker extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


}
