package com.narvar.tryitshipit.web.persistence.dao;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name = "reservations")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReservationDAO {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fitting_room_id")
    private String fittingRoomID;

    @Column(name = "store_id")
    private String storeID;

    @Column(name = "customer_id")
    private String customerID;

    @Column(name = "created_time")
    private java.sql.Timestamp createdTime;

    @Column(name = "end_time")
    private java.sql.Timestamp endTime;
}
