package com.putracode.domain.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by KrisnaPutra on 8/25/2015.
 */
public enum PersistenceManager {
        INSTANCE;
    private EntityManagerFactory emFactory;

    private PersistenceManager(){
        emFactory= Persistence.createEntityManagerFactory("jpa-example");
    }
    public EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    public void close(){
        emFactory.close();
    }
}
