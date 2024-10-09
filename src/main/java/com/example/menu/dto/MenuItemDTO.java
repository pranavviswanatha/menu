package com.example.menu.dto;

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
    @NotNull
    private double originalPrice;

    @NotNull
    private double currentPrice;

    @NotNull
    private boolean available = true;

    private int wait;
}
