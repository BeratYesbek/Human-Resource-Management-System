package com.beratyesbek.hrms.entities.dtos;

import com.beratyesbek.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDto {

    @JsonIgnore
    private JobSeeker jobSeeker;
    private List< Ability> abilities;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Language> languages;
    private List<SocialMedia> socialMedia;
    
}
