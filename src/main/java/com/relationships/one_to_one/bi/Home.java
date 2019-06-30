package com.relationships.one_to_one.bi;

import javax.persistence.*;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int number;

    @OneToOne(mappedBy = "home")
    private Person person;

    public Home(int number) {
        this.number = number;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
