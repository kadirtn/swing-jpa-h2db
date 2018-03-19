package com.example;

import com.example.entity.Employee;
import com.example.entity.Kitap;
import com.example.form.Kutuphane;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kutuphane().setVisible(true);
            }
        });
    }
    /*
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(new Kitap(1L, "KitapAdi1", "YazarAdi1","yayinevi1", "iyi1"));
            em.persist(new Kitap(2L, "KitapAdi2", "YazarAdi2","yayinevi2", "iyi2"));
            em.persist(new Kitap(3L, "KitapAdi3", "YazarAdi3","yayinevi3", "iyi3"));
            em.persist(new Kitap(4L, "KitapAdi4", "YazarAdi4","yayinevi4", "iyi4"));
            em.persist(new Kitap(5L, "KitapAdi5", "YazarAdi5","yayinevi5", "iyi5"));

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }*/
    /*
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(new Employee(1, "John"));
            em.persist(new Employee(2, "Paul"));
            em.persist(new Employee(3, "George"));
            em.persist(new Employee(4, "Ringo"));

            tx.commit();


            Employee employee = em.find(Employee.class, 1);
            em.remove(employee);

            System.out.println(employee.name);


        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
    */
}
