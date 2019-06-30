package com.relationships.many_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "citizens")
    private List<City> cities = new ArrayList<>();

    public Citizen(String name) {
        this.name = name;
    }

    public void addCity(City city) {
        cities.add(city);
    }
}
