package com.example.menu.dto;

import com.example.menu.model.OrderHistory;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class TokenDTO {

    private boolean status;
    private int tokenId;
    private String message;

    public TokenDTO(OrderHistory orderHistory) {
        status = true;
        tokenId = (int) orderHistory.getOrderId();
        message = "Ordered placed successfully!!!";
    }

    private String generateToken() {
        return UUID.randomUUID().toString();
    }

}
