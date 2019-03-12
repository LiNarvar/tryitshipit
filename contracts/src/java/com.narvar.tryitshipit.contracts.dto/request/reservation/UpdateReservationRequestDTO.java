package com.narvar.tryitshipit.contracts.dto.request.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.narvar.tryitshipit.contracts.dto.request.ItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReservationRequestDTO {

    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("items")
    private List<ItemDTO> items = null;

    @JsonProperty("store_details")
    private StoreDetailsDTO storeDetails;

}
