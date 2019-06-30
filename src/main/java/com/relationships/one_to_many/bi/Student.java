package com.relationships.one_to_many.bi;

import com.relationships.one_to_many.bi.Phone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 30.06.2019.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true, mappedBy = "student")
    private List<Phone> phones = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
* S -> P1(fk), P2(fk)
*
* */
