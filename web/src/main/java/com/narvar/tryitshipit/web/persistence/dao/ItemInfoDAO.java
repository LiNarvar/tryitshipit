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
@Table(name = "item_info")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ItemInfoDAO {
    @Id
    @Column(name = "item_id")
    private int itemID;

    @Column(name = "store_id")
    private int storeID;

    @Column(name = "sku")
    private String sku;

    @Column(name = "description")
    private String description;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column(name = "brand")
    private String brand;

    @Column(name = "product")
    private String product;

    @Column(name = "material")
    private String material;
}
