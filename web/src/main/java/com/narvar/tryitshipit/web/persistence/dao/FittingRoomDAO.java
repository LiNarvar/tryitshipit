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
@Table(name = "fitting_room")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FittingRoomDAO {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "store_id")
    private int storeID;

    @Column(name = "available")
    private boolean available;
}
