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
@Table(name = "retailer_info")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RetailerInfoDAO {
    @Id
    @Column(name = "dbio_rowid")
    private int dbioRowid;

    @Column(name = "uri_moniker")
    private String uriMonkier;

    @Column(name = "created_date")
    private java.sql.Timestamp createdDate;
}
