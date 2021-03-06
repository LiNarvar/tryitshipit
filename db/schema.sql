-- Create table space
DROP SCHEMA IF EXISTS tryitshipit CASCADE;
CREATE SCHEMA tryitshipit;

-- Create Tables
DROP TABLE IF EXISTS retailer_info;
CREATE TABLE IF NOT EXISTS retailer_info
(
  "dbio_rowid"  integer,
  "uri_moniker" VARCHAR(255) NOT NULL,
  CONSTRAINT retailer_info_pk PRIMARY KEY ("dbio_rowid")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS store_info;
CREATE TABLE IF NOT EXISTS store_info
(
  "store_id"       integer,
  "address_line1" VARCHAR(256) NOT NULL,
  "address_line2" VARCHAR(256) NOT NULL,
  "city"           VARCHAR(256) NOT NULL,
  "state"          VARCHAR(256) NOT NULL,
  "country"        VARCHAR(256) NOT NULL,
  "name"           VARCHAR(255),
  "retailer_id"    integer      NOT NULL,
  CONSTRAINT store_info_pk PRIMARY KEY ("store_id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS fitting_room;
CREATE TABLE IF NOT EXISTS fitting_room
(
  "id"        integer  NOT NULL,
  "store_id"  serial  NOT NULL,
  "available" BOOLEAN NOT NULL,
  CONSTRAINT fitting_room_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS item_info;
CREATE TABLE IF NOT EXISTS item_info
(
  "item_id"     integer       NOT NULL,
  "store_id"    integer      NOT NULL,
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


DROP TABLE IF EXISTS requests;
CREATE TABLE IF NOT EXISTS requests
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


DROP TABLE IF EXISTS customer_info;
CREATE TABLE IF NOT EXISTS customer_info
(
  "id"   integer  NOT NULL,
  "name" integer NOT NULL,
  CONSTRAINT customer_info_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS reservations;
CREATE TABLE IF NOT EXISTS reservations
(
  "id"              serial    NOT NULL,
  "fitting_room_id" integer   NOT NULL,
  "store_id"        integer   NOT NULL,
  "customer_id"     integer,
  "created_time"      TIMESTAMP NOT NULL,
  "end_time"        TIMESTAMP NOT NULL,
  CONSTRAINT reservations_pk PRIMARY KEY ("id")
) WITH (
    OIDS= FALSE
  );


DROP TABLE IF EXISTS reservation_items;
CREATE TABLE IF NOT EXISTS reservation_items
(
  "reservation_id" integer NOT NULL,
  "item_id"        integer NOT NULL
) WITH (
    OIDS= FALSE
  );



ALTER TABLE store_info
  ADD CONSTRAINT "store_info_fk0" FOREIGN KEY ("retailer_id") REFERENCES retailer_info ("dbio_rowid");

ALTER TABLE fitting_room
  ADD CONSTRAINT "fitting_room_fk0" FOREIGN KEY ("store_id") REFERENCES store_info ("store_id");

ALTER TABLE fitting_room
  ADD CONSTRAINT "fitting_room_uk0" UNIQUE ("id", "store_id");

ALTER TABLE fitting_room
  ADD CONSTRAINT "fitting_room_fk0" FOREIGN KEY ("store_id") REFERENCES store_info ("store_id");

ALTER TABLE item_info
  ADD CONSTRAINT "item_info_fk0" FOREIGN KEY ("store_id") REFERENCES store_info ("store_id");

ALTER TABLE requests
  ADD CONSTRAINT "requests_fk0" FOREIGN KEY ("fitting_room_id") REFERENCES fitting_room ("id");


ALTER TABLE reservations
  ADD CONSTRAINT "reservations_fk0" FOREIGN KEY ("fitting_room_id") REFERENCES fitting_room ("id");
ALTER TABLE reservations
  ADD CONSTRAINT "reservations_fk1" FOREIGN KEY ("store_id") REFERENCES store_info ("store_id");
ALTER TABLE reservations
  ADD CONSTRAINT "reservations_fk2" FOREIGN KEY ("customer_id") REFERENCES customer_info ("id");

ALTER TABLE reservation_items
  ADD CONSTRAINT "reservation_items_fk0" FOREIGN KEY ("reservation_id") REFERENCES reservations ("id");
ALTER TABLE reservation_items
  ADD CONSTRAINT "reservation_items_fk1" FOREIGN KEY ("item_id") REFERENCES item_info ("item_id");


