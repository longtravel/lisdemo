package com.company.lisdemo.core;

import com.company.lisdemo.LisdemoTestContainer;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.security.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import com.company.lisdemo.entity.LisFacFile;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//import com.company.lisdemo.entity.LisFacFile;

public class LisFacFileTest {

    @ClassRule
    public static LisdemoTestContainer cont = LisdemoTestContainer.Common.INSTANCE;

    private Metadata metadata;
    private Persistence persistence;
    private DataManager dataManager;

    @Before
    public void setUp() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    /*@Test
    public void testLoadUser() throws Exception {
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<User> query = em.createQuery(
                    "select u from sec$User u where u.login = :userLogin", User.class);
            query.setParameter("userLogin", "admin");
            List<User> users = query.getResultList();
            tx.commit();
            assertEquals(1, users.size());
        }
    }*/

    @Test
    public void testFetchFacilityREST() {
        // start up a restful client
        // get the resource
        // establish a security token
        assertEquals(1, 1);
    }

    @Test
    public void testLisFacFile() throws Exception {
        // Get a managed bean (or service) from container
        DataManager dataManager = AppBeans.get(DataManager.class);
        Integer fetchID = 430707597;
        LisFacFile facility = dataManager.load(LoadContext.create(LisFacFile.class).setId(fetchID).setView(View.LOCAL));
        assertNotNull(facility);

    }
}