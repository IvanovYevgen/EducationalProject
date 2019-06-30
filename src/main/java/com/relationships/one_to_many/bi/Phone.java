package com.relationships.one_to_many.bi;

/**
 * Created by Admin on 30.06.2019.
 */

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int number;

    @ManyToOne
    @JoinColumn(name = "student_fk_id")
    private Student student;

    public Phone(int number, Student student) {
        this.number = number;
        this.student = student;
    }

    public Phone() {
    }
}
