package com.yoon.orderup.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Long id;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "orders")
    private final List<MenuContainer> menuList = new ArrayList<>();

    @Builder
    Orders(User user, MenuContainer menuContainer){
        this.user = user;
        this.menuList.add(menuContainer);
    }
    public void addMenu(MenuContainer container){
        this.menuList.add(container);
    }
}
