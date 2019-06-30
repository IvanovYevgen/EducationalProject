package com.relationships.one_to_one.uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Admin on 28.06.2019.
 */
public class TestOneToONeUni {
    public static void main(String[] args) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

            EntityManager em = factory.createEntityManager();

            EntityTransaction tran = em.getTransaction();

            tran.begin();

            Address address = new Address("KIev");

            Man man = new Man("John", address);

//            em.persist(man);

            Man man1 = em.find(Man.class, 3);

//            em.remove(man1);

            man1.setAddress(null);

            tran.commit();

            em.close();

            factory.close();

        }

}
