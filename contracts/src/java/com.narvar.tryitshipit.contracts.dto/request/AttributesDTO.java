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
public class AttributesDTO {

    @JsonProperty("size")
    private String size;

    @JsonProperty("color")
    private String color;

    @JsonProperty("material")
    private String material;

}
