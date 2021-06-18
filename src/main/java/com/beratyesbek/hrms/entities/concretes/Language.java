package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int language_id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "rating")
    private float rating;

    @ManyToOne
    @JoinColumn(name = "id")
    private JobSeeker jobSeeker;
}
