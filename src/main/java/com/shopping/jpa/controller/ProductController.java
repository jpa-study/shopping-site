package com.shopping.jpa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
@Transactional
public class ProductController {
    @PersistenceContext
    EntityManager entityManager;

    //TODO : CRUD
}
