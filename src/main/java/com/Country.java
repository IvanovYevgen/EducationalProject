package com;


import javax.persistence.*;

/**
 * Created by Admin on 23.06.2019.
 */
@Entity
//@Table(name = "AnotherCountry")
//@NamedQueries()
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private int id;

    private String name;

    public Country(String name) {
        this.name = name;
    }

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tran = em.getTransaction();

        tran.begin();

        Country country = new Country("UA");

//        em.persist(country);

//        Country country1 = em.find(Country.class, 1);

        TypedQuery<Country> query = em.createQuery("FROM Country c WHERE c.id = 1", Country.class);

        Country country1 = query.getSingleResult();

        tran.commit();

        em.close();

        factory.close();
    }
}