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
@Table(name = "store_info")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StoreInfoDAO {
    @Id
    @Column(name = "store_id")
    private int id;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "name")
    private String name;

    @Column(name = "retailer_id")
    private int retailerID;
}
