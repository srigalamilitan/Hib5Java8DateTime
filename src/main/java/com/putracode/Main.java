package com.putracode;

import com.putracode.domain.OrderTransaction;
import com.putracode.domain.util.PersistenceManager;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by KrisnaPutra on 8/25/2015.
 */
public class Main {
    public static void main(String[] args) {
        EntityManager em =PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        for (int i = 0; i < 10; i++) {
            OrderTransaction order=new OrderTransaction();
            order.setOrderProduct("Computer No "+i);
            //Date With LocalDate
            order.setOrderDate(LocalDate.now());
            //Time With LocalTime
            order.setOrderTime(LocalTime.now());
            //TimeStamp with LocalDateTime
            order.setOrderCreated(LocalDateTime.now());
            em.persist(order);
        }
        em.getTransaction().commit();
        em.close();
        PersistenceManager.INSTANCE.close();
    }
}
