package com.rw.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Component
public class BookJpaDao{

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    public void deleteBookBuyer(Integer book_id, Integer buyer_id){
        entityManager.createQuery("delete * from buyer_book where book_id = "
                + book_id + " and buyer_id =" + buyer_id +";");
    }
}
