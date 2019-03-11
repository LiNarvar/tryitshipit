-- Create table space
DROP SCHEMA IF EXISTS tryitshipit CASCADE;
CREATE SCHEMA tryitshipit;


-- Create Tables
DROP TABLE IF EXISTS tryitshipit.retailer_info;
CREATE TABLE IF NOT EXISTS tryitshipit.retailer_info
(
  "dbio_rowid"  serial,
  "uri_moniker" VARCHAR(255) NOT NULL,
  "created_at"  DATETIME,
  CONSTRAINT retailer_info_pk PRIMARY KEY ("dbio_rowid")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.store_info;
CREATE TABLE IF NOT EXISTS tryitshipit.store_info
(
  "store_id"       serial,
  "address_line_1" VARCHAR(256) NOT NULL,
  "address_line_2" VARCHAR(256) NOT NULL,
  "city"           VARCHAR(256) NOT NULL,
  "state"          VARCHAR(256) NOT NULL,
  "country"        VARCHAR(256) NOT NULL,
  "name"           VARCHAR(255),
  "retailer_id"    integer      NOT NULL,
  CONSTRAINT store_info_pk PRIMARY KEY ("store_id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.fitting_room;
CREATE TABLE IF NOT EXISTS tryitshipit.fitting_room
(
  "id"        serial  NOT NULL,
  "store_id"  serial  NOT NULL,
  "available" BOOLEAN NOT NULL,
  CONSTRAINT fitting_room_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.item_info;
CREATE TABLE IF NOT EXISTS tryitshipit.item_info
(
  "store_id"    integer      NOT NULL,
  "item_id"     serial       NOT NULL,
  "sku"         VARCHAR(255) NOT NULL,
  "description" VARCHAR(256) NOT NULL,
  "color"       VARCHAR(256) NOT NULL,
  "size"        VARCHAR(100) NOT NULL,
  "brand"       VARCHAR(255) NOT NULL,
  "product"     VARCHAR(255) NOT NULL,
  "material"    VARCHAR(255) NOT NULL,
  CONSTRAINT item_info_pk PRIMARY KEY ("item_id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.requests;
CREATE TABLE IF NOT EXISTS tryitshipit.requests
(
  "id"              serial       NOT NULL,
  "fitting_room_id" integer      NOT NULL,
  "color"           VARCHAR(255) NOT NULL,
  "size"            VARCHAR(255) NOT NULL,
  "brand"           VARCHAR(255) NOT NULL,
  "product"         VARCHAR(255) NOT NULL,
  "status"          VARCHAR(255) NOT NULL,
  "created_time"    TIMESTAMP    NOT NULL,
  "end_time"        TIMESTAMP    NOT NULL,
  CONSTRAINT requests_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.customer_info;
CREATE TABLE IF NOT EXISTS tryitshipit.customer_info
(
  "id"   serial  NOT NULL,
  "name" integer NOT NULL,
  CONSTRAINT customer_info_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.reservations;
CREATE TABLE IF NOT EXISTS tryitshipit.reservations
(
  "id"              serial    NOT NULL,
  "fitting_room_id" integer   NOT NULL,
  "store_id"        integer   NOT NULL,
  "customer_id"     integer,
  "begin_time"      TIMESTAMP NOT NULL,
  "end_time"        TIMESTAMP NOT NULL,
  CONSTRAINT reservations_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS tryitshipit.reservation_items;
CREATE TABLE IF NOT EXISTS tryitshipit.reservation_items
(
  "reservation_id" integer NOT NULL,
  "item_id"        integer NOT NULL
) WITH (
    OIDS= FALSE
  );



ALTER TABLE tryitshipit.store_info
  ADD CONSTRAINT "store_info_fk0" FOREIGN KEY ("retailer_id") REFERENCES tryitshipit.retailer_info ("dbio_rowid");

ALTER TABLE tryitshipit.fitting_room
  ADD CONSTRAINT "fitting_room_fk0" FOREIGN KEY ("store_id") REFERENCES tryitshipit.store_info ("store_id");

ALTER TABLE tryitshipit.fitting_room
  ADD CONSTRAINT "fitting_room_uk0" UNIQUE ("id", "store_id");

ALTER TABLE tryitshipit.fitting_room
  ADD CONSTRAINT "fitting_room_fk0" FOREIGN KEY ("store_id") REFERENCES tryitshipit.store_info ("store_id");

ALTER TABLE tryitshipit.item_info
  ADD CONSTRAINT "item_info_fk0" FOREIGN KEY ("store_id") REFERENCES tryitshipit.store_info ("store_id");

ALTER TABLE tryitshipit.requests
  ADD CONSTRAINT "requests_fk0" FOREIGN KEY ("fitting_room_id") REFERENCES tryitshipit.fitting_room ("id");


ALTER TABLE tryitshipit.reservations
  ADD CONSTRAINT "reservations_fk0" FOREIGN KEY ("fitting_room_id") REFERENCES tryitshipit.fitting_room ("id");
ALTER TABLE tryitshipit.reservations
  ADD CONSTRAINT "reservations_fk1" FOREIGN KEY ("store_id") REFERENCES tryitshipit.store_info ("store_id");
ALTER TABLE tryitshipit.reservations
  ADD CONSTRAINT "reservations_fk2" FOREIGN KEY ("customer_id") REFERENCES tryitshipit.customer_info ("id");

ALTER TABLE tryitshipit.reservation_items
  ADD CONSTRAINT "reservation_items_fk0" FOREIGN KEY ("reservation_id") REFERENCES tryitshipit.reservations ("id");
ALTER TABLE tryitshipit.reservation_items
  ADD CONSTRAINT "reservation_items_fk1" FOREIGN KEY ("item_id") REFERENCES tryitshipit.item_info ("item_id");


