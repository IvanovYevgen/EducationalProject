package com.relationships.one_to_one.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Admin on 28.06.2019.
 */
public class TestOneToOneBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Home home = new Home(2);

        Person person = new Person("Jakc", home);

        home.setPerson(person);

        em.persist(person);

        tran.commit();

        em.close();

        factory.close();

    }

}
