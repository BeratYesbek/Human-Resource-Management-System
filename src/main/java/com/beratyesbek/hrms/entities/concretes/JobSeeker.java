package com.beratyesbek.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "job_seekers")
@Data
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;


    @Column(name = "identity_number")
    private String identityNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<Ability> abilities;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<Language> languages;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<SocialMedia> socialMedia;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<Experience> experiences;

    @JsonIgnore
    @OneToMany(mappedBy = "jobSeeker")
    private List<Education> educations;

}
