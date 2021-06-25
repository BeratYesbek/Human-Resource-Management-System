package com.beratyesbek.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetter {

    @Id
    @Column(name = "cover_letter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cover_letter_id;

    private String cover_letter_text;

    @ManyToOne
    @JoinColumn(name = "id")
    private JobSeeker jobSeeker;
}
