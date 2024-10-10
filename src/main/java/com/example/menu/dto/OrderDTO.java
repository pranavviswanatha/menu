package com.example.menu.dto;

import lombok.*;

@RequiredArgsConstructor
public class OrderDTO {

    private boolean status;
    private int tokenId;
    private String message;

}
