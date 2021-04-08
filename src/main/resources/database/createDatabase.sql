--liquibase formatted sql
--changeset sejtan:1
CREATE TABLE WIZARD (
name VARCHAR (2000),
image VARBINARY(max)
);

--changeset sejtan:2
--INSERT INTO WIZARD (name, image) VALUES (ability1, (SELECT * FROM OPENROWSET(BULK 'E:\JAVA\IntelliJ IDEA Community Edition 2020.3\Projects\hrcard\src\main\resources\database\pictures\W-A-1-flame-burst.jpg', SINGLE_BLOB) as Image));