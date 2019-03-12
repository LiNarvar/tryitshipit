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
@Table(name = "reservation_items")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReservationItemDAO {
    @Id
    @Column(name = "reservation_id")
    private int reservationID;

    @Column(name = "item_id")
    private int itemID;
}
