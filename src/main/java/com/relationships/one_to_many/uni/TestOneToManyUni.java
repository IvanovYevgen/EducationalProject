package com.relationships.one_to_many.uni;

import com.relationships.one_to_one.bi.Home;
import com.relationships.one_to_one.bi.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Admin on 28.06.2019.
 */
public class TestOneToManyUni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        University university = new University("NTU");

        People people1 = new People("John");

        People people2 = new People("Jack");

        university.addPeople(people1);

        university.addPeople(people2);

        em.persist(university);

        tran.commit();

        em.close();

        factory.close();

    }

}
