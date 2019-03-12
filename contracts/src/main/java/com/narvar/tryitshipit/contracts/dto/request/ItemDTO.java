package com.narvar.tryitshipit.contracts.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("attributes")
    private AttributesDTO attributes;

}
