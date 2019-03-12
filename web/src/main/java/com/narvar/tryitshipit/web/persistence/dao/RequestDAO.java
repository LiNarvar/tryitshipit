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
@Table(name = "requests")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RequestDAO {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fitting_room_id")
    private String fittingRoomID;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column(name = "brand")
    private String brand;

    @Column(name = "product")
    private String product;

    @Column(name = "status")
    private String status;

    @Column(name = "created_time")
    private java.sql.Timestamp createdTime;

    @Column(name = "end_time")
    private java.sql.Timestamp endTime;
}
