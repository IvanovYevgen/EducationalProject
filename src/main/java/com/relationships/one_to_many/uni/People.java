package com.relationships.one_to_many.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public People(String name) {
        this.name = name;
    }

    public People() {
    }
}
