package com.relationships.one_to_one.uni;

import javax.persistence.*;


@Entity
public class Man {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinColumn(name = "address_fk_id")
    private Address address;

    public Man(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Man() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
