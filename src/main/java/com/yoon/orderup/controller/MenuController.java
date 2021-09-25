package com.yoon.orderup.controller;

import com.yoon.orderup.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @GetMapping("menu")
    ResponseEntity<?> getMenu(){
        return new ResponseEntity<>(menuService.getAllMenu(), HttpStatus.OK);
    }
    @PostMapping("menu")
    ResponseEntity<?> addMenu(final String item, final int price){
        return new ResponseEntity<>(menuService.addMenu(item,price),HttpStatus.OK);
    }

    @DeleteMapping("menu/{deleteMenuId}")
    ResponseEntity<?> deleteMenu(@PathVariable final Long deleteMenuId){
        if (menuService.deleteMenu(deleteMenuId))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        return new ResponseEntity<>("Menu Not found",HttpStatus.NOT_FOUND);
    }

}
