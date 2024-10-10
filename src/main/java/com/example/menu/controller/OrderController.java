package com.example.menu.controller;

import com.example.menu.dto.MenuItemDTO;
import com.example.menu.enums.ItemType;
import com.example.menu.model.MenuItem;
import com.example.menu.repo.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    Menu menu;

    @GetMapping("/getItems")
    public List<MenuItemDTO> getItems (@RequestParam ItemType itemType) {
        List<MenuItem> listItems = menu.f
    }

    @PostMapping("/placeOrder")
    public

}
