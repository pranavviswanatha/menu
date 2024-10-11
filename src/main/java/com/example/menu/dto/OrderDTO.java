package com.example.menu.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Map;

@RequiredArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private int customerId;
    private Map<Integer, Integer> orderInfo;
    private double amountPaid;

}
