package com.relationships.one_to_many.uni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "univer_people",
            joinColumns = @JoinColumn(name = "univer_fk_id"),
    inverseJoinColumns = @JoinColumn(name = "people_fk_id"))
    private List<People> peoples = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public University() {
    }

    public void addPeople(People people) {
        peoples.add(people);
    }
}
