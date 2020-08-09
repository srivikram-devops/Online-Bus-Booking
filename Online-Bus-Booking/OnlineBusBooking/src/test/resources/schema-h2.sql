DROP TABLE IF EXISTS city;

DROP TABLE IF EXISTS bus_details;

CREATE TABLE city (
    code            NUMBER(10) PRIMARY KEY,
    city_name       NVARCHAR2(150) NOT NULL,
    is_active       NVARCHAR2(1) NOT NULL,
    created_by      NVARCHAR2(50),
    creation_date   TIMESTAMP,
    modified_by     NVARCHAR2(50),
    modify_date     TIMESTAMP
);

CREATE TABLE bus_details (
    bus_id           NUMBER(10) PRIMARY KEY,
    bus_number       NVARCHAR2(15),
    bus_name         NVARCHAR2(150),
    departure_code   NUMBER(10),
    arrival_code     NUMBER(10),
    start_time       NVARCHAR2(10),
    arrival_time     NVARCHAR2(10),
    duration         NVARCHAR2(50),
    bus_fair         NUMBER(10),
    is_active        NVARCHAR2(10),
    created_by       NVARCHAR2(50),
    creation_date    TIMESTAMP,
    modified_by      NVARCHAR2(50),
    modify_date      TIMESTAMP
);
