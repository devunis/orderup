package com.yoon.orderup.service;

import com.yoon.orderup.dto.MenuResponseEntity;
import com.yoon.orderup.model.Menu;
import com.yoon.orderup.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class MenuService {
    private final MenuRepository repository;

    @Transactional
    public List<MenuResponseEntity> getAllMenu(){
        return repository.findAll()
                .stream()
                .map(menu ->MenuResponseEntity.builder()
                        .item(menu.getItem())
                        .price(menu.getPrice())
                        .picture(menu.getPicture())
                        .build())
                .collect(Collectors.toList());
    }

    @Transactional
    public Long addMenu(String item, int price){
        log.info(item);
        return repository.save(Menu.builder()
                .item(item)
                .price(price)
                .build()).getId();
    }
    @Transactional
    public Boolean deleteMenu(final Long menuId){
        if (repository.findById(menuId).isPresent()) {
            repository.deleteById(menuId);
            return true;
        }
        return false;
    }
}
