package com.relationships.one_to_one.uni;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String city;

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }


}
