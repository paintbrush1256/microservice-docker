connect 'jdbc:derby://localhost:1527/metrodb;create=true;traceFile=trace.out;user=shibu;password=shibu';



DROP TABLE ROUTE.ROUTE_STATION;
DROP TABLE ROUTE.ROUTE;
DROP TABLE ROUTE.STATION;
DROP SEQUENCE hibernate_sequence restrict;
--DROP PUBLIC SYNONYM hibernate_sequence;

drop schema route restrict;
create schema route;


CREATE TABLE ROUTE.STATION (
  STATION_ID             INTEGER PRIMARY KEY,
  STATION_NAME           VARCHAR(100),
  LAST_MODIFIED_DATETIME DATE  DEFAULT CURRENT_DATE
);

CREATE TABLE ROUTE.ROUTE (
  ROUTE_ID               INTEGER PRIMARY KEY,
  ROUTE_NUMBER           VARCHAR(100),
  START_STATION_ID       INTEGER NOT NULL,
  END_STATION_ID         INTEGER NOT NULL,
  TRAIN_INTEGER          INTEGER         ,
  LAST_MODIFIED_DATETIME DATE  DEFAULT CURRENT_DATE
);

CREATE TABLE ROUTE.ROUTE_STATION (
  ROUTE_STATION_ID       INTEGER PRIMARY KEY,
  ROUTE_ID               INTEGER NOT NULL,
  STATION_ORDER          INTEGER NOT NULL,
  STATION_ID             INTEGER NOT NULL,
  LAST_MODIFIED_DATETIME DATE  DEFAULT CURRENT_DATE
);

--ALTER TABLE ROUTE         ADD FOREIGN KEY (START_STATION_ID) REFERENCES STATION(STATION_ID);
--ALTER TABLE ROUTE         ADD FOREIGN KEY (END_STATION_ID)   REFERENCES STATION(STATION_ID);

--ALTER TABLE ROUTE_STATION ADD FOREIGN KEY (ROUTE_ID)   REFERENCES ROUTE(ROUTE_ID);
--ALTER TABLE ROUTE_STATION ADD FOREIGN KEY (STATION_ID) REFERENCES STATION(STATION_ID);

---------------------------------------------------------------------------------------------------------
--This sequence is required by Hibernate for AUTO_INCREMENTING columns across the application
CREATE SEQUENCE hibernate_sequence
  INCREMENT BY 1
  MINVALUE 1
  MAXVALUE 2147483647
;

--CREATE PUBLIC SYNONYM hibernate_sequence FOR ROUTE.hibernate_sequence;
---------------------------------------------------------------------------------------------------------
