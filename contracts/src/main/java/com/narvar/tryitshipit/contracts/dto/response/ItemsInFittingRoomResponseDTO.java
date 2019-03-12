package com.narvar.tryitshipit.contracts.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class ItemsInFittingRoomResponseDTO {
    private List<ItemResponseDTO> items = null;
}
