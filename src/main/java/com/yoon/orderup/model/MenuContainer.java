package com.yoon.orderup.model;

import lombok.Builder;

import javax.persistence.*;

@Entity
public class MenuContainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cnt;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;
}
