package com.yoon.orderup.service;

import com.yoon.orderup.model.MenuContainer;
import com.yoon.orderup.model.Orders;
import com.yoon.orderup.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class OrderService {
    private OrderRepository repository;

//    @Transactional
//    public Long addOrders(Long userId, Long menuId, int cnt){
//        final Orders orders = new Orders(userId, new MenuContainer(menuId,cnt));
//        repository.save(orders);
//    }
}
