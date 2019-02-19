-- Create table space
DROP SCHEMA IF EXISTS projecttemplate CASCADE;
CREATE SCHEMA projecttemplate;


-- Create Tables
DROP TABLE IF EXISTS projecttemplate.table1;
CREATE TABLE IF NOT EXISTS projecttemplate.table1 (
    intfield1 int,
    textfield2 text,
    realfield3 real,
    booleanfield4 boolean,
    PRIMARY KEY (id)
);

-- Empty tables
TRUNCATE TABLE projecttemplate.table1;
