package com.relationships.many_to_many;

import com.relationships.one_to_many.uni.People;
import com.relationships.one_to_many.uni.University;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Admin on 28.06.2019.
 */
public class TestManyToManyBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        City kiev = new City("Kiev");
        City odessa = new City("Odessa");

        Citizen citizen1 = new Citizen("John");

        Citizen citizen2 = new Citizen("Jack");

        kiev.addCitizen(citizen1);
        odessa.addCitizen(citizen1);

        kiev.addCitizen(citizen2);
        odessa.addCitizen(citizen2);

        citizen1.addCity(odessa);
        citizen1.addCity(kiev);

        citizen2.addCity(odessa);
        citizen2.addCity(kiev);

        em.persist(odessa);
        em.persist(kiev);

        tran.commit();

        em.close();

        factory.close();

    }

}
