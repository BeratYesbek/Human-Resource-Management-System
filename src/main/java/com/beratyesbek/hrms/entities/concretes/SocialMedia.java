package com.beratyesbek.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "socialMedia")
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "social_media_id")
    private int socialMediaId;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "id")
    private JobSeeker jobSeeker;

}
