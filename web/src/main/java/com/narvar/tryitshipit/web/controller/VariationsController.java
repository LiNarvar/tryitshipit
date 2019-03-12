package com.narvar.tryitshipit.web.controller;

import com.narvar.tryitshipit.contracts.dto.response.VariationsResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariationsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VariationsController.class);
    private static final String REQUEST_MAPPING_VARIATIONS = "/variations";


    @GetMapping(
            value = REQUEST_MAPPING_VARIATIONS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VariationsResponseDTO> variations(
            @RequestParam("item_id") Integer itemId) {
        return null;
    }
}
