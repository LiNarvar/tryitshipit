package com.narvar.tryitshipit.contracts.dto.response;

import com.narvar.tryitshipit.contracts.dto.request.ItemDTO;
import lombok.Data;

import java.util.List;

@Data
public class ReservationRequestsResponseDTO {
    private Integer requestId;
    private Integer customerId;
    private Integer fittingRoom;
    private List<ItemDTO> items = null;
}
