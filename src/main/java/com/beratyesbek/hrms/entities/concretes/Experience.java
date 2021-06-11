package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "experiences")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private int experience_id;

    @Column(name = "work_place_name")
    private String workPlaceName;

    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "starting_date")
    private Date startingDate;

    @Column(name = "end_date")
    private Date endDate;


}
