package com.narvar.tryitshipit.contracts.dto.request.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreDetailsDTO {

    @JsonProperty("store_id")
    private Integer storeId;

    @JsonProperty("attendant_id")
    private Integer attendantId;

}
