package com.narvar.tryitshipit.contracts.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class VariationsResponseDTO {
    private List<ItemResponseDTO> items = null;
    private List<OptionsResponseDTO> options = null;
}
