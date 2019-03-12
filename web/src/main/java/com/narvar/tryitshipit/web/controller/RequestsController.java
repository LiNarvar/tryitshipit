package com.narvar.tryitshipit.web.controller;

import com.narvar.tryitshipit.contracts.dto.request.similaritems.FetchRequest;
import com.narvar.tryitshipit.contracts.dto.response.FetchResponseDTO;
import com.narvar.tryitshipit.contracts.dto.response.ReservationRequestsResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestsController.class);
    private static final String REQUEST_MAPPING_REQUESTS = "/requests";
    private static final String REQUEST_MAPPING_GET_REQUESTS = "/requests/{fitting_room_id}";

    @PostMapping(
            value = REQUEST_MAPPING_REQUESTS,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FetchResponseDTO> request(@RequestBody FetchRequest fetchRequest) {
        return null;
    }

    @GetMapping(
            value = REQUEST_MAPPING_GET_REQUESTS,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ReservationRequestsResponseDTO> requestsForRoom(
            @PathVariable("fitting_room_id") Integer fittingRoomId) {
        return null;
    }
}
