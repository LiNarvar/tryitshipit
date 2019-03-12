package com.narvar.tryitshipit.contracts.dto.request.similaritems;

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
public class FetchRequest {

    @JsonProperty("customer_id")
    private Integer customerId;

    @JsonProperty("fitting_room")
    private Integer fittingRoom;

    @JsonProperty("items")
    private List<ItemDTO> items = null;

}
