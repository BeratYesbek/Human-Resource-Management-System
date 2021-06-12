package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "abilities")
public class Ability {

    @Id
    @Column(name = "ability_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ability_id;

    @Column(name = "technology_name")
    private String  technologyName;

    @Column(name = "rating")
    private float rating;
}
