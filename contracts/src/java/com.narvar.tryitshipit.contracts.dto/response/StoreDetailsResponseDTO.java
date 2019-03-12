package com.narvar.tryitshipit.contracts.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StoreDetailsResponseDTO {
    private Integer storeId;
    private Integer attendantId;
}
