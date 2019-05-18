package com.shopping.jpa.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @ManyToOne
    private Order order;

    @Column
    @ManyToOne
    private Code type;

    @Column
    private int value;
}
