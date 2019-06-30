package com.relationships.one_to_many.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Admin on 28.06.2019.
 */
public class TestOneToManyBi {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Student student = new Student("John");

        Phone phone1 = new Phone(67, student);
        Phone phone2 = new Phone(95, student);

        student.addPhone(phone1);
        student.addPhone(phone2);

        Student student1 = em.find(Student.class, 11);

//        student1.getPhones().remove(0);

//        em.persist(student);

//        student.setName("Kevin");

        tran.commit();

        em.close();

        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        student1.setName("Luisa");

        Student student2 = manager.merge(student1);

        manager.persist(student2);

        transaction.commit();

        manager.close();

        factory.close();

    }

}
