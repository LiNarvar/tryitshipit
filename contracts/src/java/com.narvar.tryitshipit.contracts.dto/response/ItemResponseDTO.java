package com.narvar.tryitshipit.contracts.dto.response;

import lombok.Data;

@Data
public class ItemResponseDTO {
    private String itemId;
    private String sku;
    private String description;
    private Double price;
    private AttributesResponseDTO attributes;
}
