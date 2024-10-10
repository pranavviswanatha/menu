package com.example.menu.dto;

import com.example.menu.model.MenuItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuItemDTO {
    private int id;
    @NotNull
    private String name;
    private String ingredients;
    private double originalPrice;
    private double currentPrice;
    private boolean available = true;
    private int wait;

    public MenuItemDTO(MenuItem menuitem) {
        this.id = menuitem.getId();
        this.name = menuitem.getName();
        this.ingredients = menuitem.getIngredients();
        this.currentPrice = menuitem.getCurrentPrice();
        this.originalPrice = menuitem.getOriginalPrice();
        this.available = menuitem.isAvailable();
    }
}
