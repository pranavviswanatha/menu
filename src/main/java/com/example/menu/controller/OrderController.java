package com.example.menu.controller;

import com.example.menu.dto.MenuItemDTO;
//import com.example.menu.dto.OrderDTO;
//import com.example.menu.dto.TokenDTO;
import com.example.menu.dto.OrderDTO;
import com.example.menu.dto.TokenDTO;
import com.example.menu.enums.ItemType;
import com.example.menu.model.MenuItem;
import com.example.menu.model.OrderHistory;
import com.example.menu.repo.Menu;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderController {

    @Autowired
    Menu menu;

    @GetMapping("/getItems")
    public List<MenuItemDTO> getItems (@RequestParam(required = true, defaultValue = "0") int iType) {
        ItemType itemType = ItemType.getValue(iType);
        List<MenuItem> listItems = null;
        if (itemType != null)
            listItems = menu.findAllByItemType(itemType);
        else
            listItems = menu.findAll();
        List<MenuItemDTO> listDto = new ArrayList<>();
        for (MenuItem menuItem : listItems)
            listDto.add(new MenuItemDTO(menuItem));
        return listDto;
    }

    @PostMapping(value = "/placeOrder", produces = "application/json")
    public ResponseEntity<TokenDTO> placeOrder (@RequestBody OrderDTO dto) {
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setCustomerId((long) Math.floor(Math.random()));
        orderHistory.setPrice(dto.getAmountPaid());
        orderHistory.setOrderContents(dto.getOrderInfo());
        orderHistory.setRating(3);
        return ResponseEntity.ok(new TokenDTO(orderHistory));
    }

}
