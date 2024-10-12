package com.example.menu.dto;

import com.example.menu.model.OrderHistory;
import lombok.RequiredArgsConstructor;

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

}
