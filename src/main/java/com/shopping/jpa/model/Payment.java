package com.shopping.jpa.model;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    private String id;

    @Column
    @ManyToOne
    private Order order;

    @Column
    @ManyToOne
    private Code type;

    @Column
    private int value;
}
