package com.shopping.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String contents;
}
