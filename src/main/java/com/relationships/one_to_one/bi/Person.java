package com.relationships.one_to_one.bi;

import javax.persistence.*;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "home_fk_id")
    private Home home;

    public Person(String name, Home home) {
        this.name = name;
        this.home = home;
    }

    public Person() {
    }
}

/*
* A -> B
* B -> A
* */
