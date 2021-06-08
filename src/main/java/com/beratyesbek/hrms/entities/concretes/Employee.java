package com.beratyesbek.hrms.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employees")


public class Employee extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Employee(int id,String firstName, String lastName, String email, String dateOfBirth, String identityNumber) {
        super(firstName, lastName, email, dateOfBirth, identityNumber);
        this.id = id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
