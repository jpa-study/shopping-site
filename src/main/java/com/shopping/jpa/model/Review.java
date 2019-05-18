package com.shopping.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private List<Comment> comments;
}
