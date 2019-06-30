package com.relationships.many_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "city_citizen",
            joinColumns = @JoinColumn(name = "city_fk_id"),
            inverseJoinColumns = @JoinColumn(name = "citizen_fk_id")
    )
    private List<Citizen> citizens = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }
}
