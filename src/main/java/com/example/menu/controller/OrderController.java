package com.example.menu.controller;

import com.example.menu.dto.MenuItemDTO;
import com.example.menu.dto.OrderDTO;
import com.example.menu.enums.ItemType;
import com.example.menu.model.MenuItem;
import com.example.menu.repo.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    Menu menu;

    @GetMapping("/getItems")
    public List<MenuItemDTO> getItems (@RequestParam int iType) {
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

    @PostMapping("/placeOrder")
    public TokenDTO placeOrder (@RequestBody OrderDTO) {

    }

}
