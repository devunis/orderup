package com.yoon.orderup.repository;

import com.yoon.orderup.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Optional<Menu> getById(Long id);
}
