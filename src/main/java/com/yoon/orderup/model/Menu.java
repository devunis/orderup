package com.yoon.orderup.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;

    private String item;
    private int price;
    private String picture;

    @Builder
    public Menu(String item, int price, String picture) {
        this.item = item;
        this.price = price;
        this.picture = picture;
    }
}
