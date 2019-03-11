-- Create table space
DROP SCHEMA IF EXISTS tryitshipit CASCADE;
CREATE SCHEMA tryitshipit;


-- Create Tables
DROP TABLE IF EXISTS tryitshipit.table1;
CREATE TABLE IF NOT EXISTS tryitshipit.table1 (
    intfield1 int,
    textfield2 text,
    realfield3 real,
    booleanfield4 boolean,
    PRIMARY KEY (id)
);

-- Empty tables
TRUNCATE TABLE tryitshipit.table1;
