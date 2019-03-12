package com.narvar.tryitshipit.contracts.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class OptionsResponseDTO {
    private String title;
    private String code;
    private List<String> values = null;
}
