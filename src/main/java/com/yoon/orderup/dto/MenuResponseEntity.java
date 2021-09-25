package com.yoon.orderup.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
public class MenuResponseEntity {
    private final String item;
    private final int price;
    private final String picture;

    public MenuResponseEntity(String item, int price, String picture) {
        this.item = item;
        this.price = price;
        this.picture = picture;
    }
}
