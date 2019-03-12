package com.narvar.tryitshipit.web.controller;

import com.narvar.tryitshipit.contracts.dto.request.reservation.ReservationRequestDTO;
import com.narvar.tryitshipit.contracts.dto.request.reservation.UpdateReservationRequestDTO;
import com.narvar.tryitshipit.contracts.dto.response.ItemsInFittingRoomResponseDTO;
import com.narvar.tryitshipit.contracts.dto.response.ReservationResponseDTO;
import com.narvar.tryitshipit.contracts.dto.response.UpdateReservationResponseDTO;
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
public class ReservationsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationsController.class);
    private static final String REQUEST_MAPPING_RESERVATION = "/reserve";
    private static final String REQUEST_MAPPING_UPDATE_RESERVATION = "/fitting_room/{fitting_room_id}/item";
    private static final String REQUEST_MAPPING_GET_ITEMS_IN_ROOM = "/fitting_room/{fitting_room_id}/items";

    @PostMapping(
            value = REQUEST_MAPPING_RESERVATION,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponseDTO> reserve(
            @RequestBody ReservationRequestDTO reservationRequestDTO) {
        return null;
    }

    @PostMapping(
            value = REQUEST_MAPPING_UPDATE_RESERVATION,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UpdateReservationResponseDTO> updateReservation(
            @PathVariable("fitting_room_id") Integer fittingRoomId,
            @RequestBody UpdateReservationRequestDTO updateReservationRequestDTO) {
        return null;
    }

    @GetMapping(
            value = REQUEST_MAPPING_GET_ITEMS_IN_ROOM,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemsInFittingRoomResponseDTO> getItemsInFittingRoom(
            @PathVariable("fitting_room_id") Integer fittingRoomId) {
        return null;
    }



}
