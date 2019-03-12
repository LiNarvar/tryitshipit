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
@Table(name = "customer_info")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CustomerInfoDAO {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
