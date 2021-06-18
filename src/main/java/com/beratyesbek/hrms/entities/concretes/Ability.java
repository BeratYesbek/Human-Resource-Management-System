package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "abilities")
public class Ability {

    @Id
    @Column(name = "ability_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ability_id;

    @Column(name = "technology_name")
    private String  technologyName;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "id")
    private JobSeeker jobSeeker;


}
