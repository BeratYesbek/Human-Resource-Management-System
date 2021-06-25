package com.beratyesbek.hrms.entities.dtos;

import com.beratyesbek.hrms.entities.concretes.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;


@Data
public class CvDto {

    @JsonIgnore
    private JobSeeker jobSeeker;
    private List<Ability> abilities;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Language> languages;
    private SocialMedia socialMedia;
    private CoverLetter coverLetter;

    public CvDto(JobSeeker jobSeeker, List<Ability> abilities, List<Experience> experiences,
                 List<Education> educations, List<Language> languages, SocialMedia socialMedia,CoverLetter coverLetter) {
        this.jobSeeker = jobSeeker;
        this.abilities = abilities;
        this.experiences = experiences;
        this.educations = educations;
        this.languages = languages;
        this.socialMedia = socialMedia;
        this.coverLetter = coverLetter;
    }
}
