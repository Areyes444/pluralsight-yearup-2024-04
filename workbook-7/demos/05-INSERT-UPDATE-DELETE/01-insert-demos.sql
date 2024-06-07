/*
    SQL Syntax
    DML - Data Manipulation Language
    INSERT - add new record
    UPDATE - modify a record
    DELETE - deleting a record
    SELECT - retrieve records 

*/

USE world;

INSERT INTO city
(
    Name
    , CountryCode
    , District
    , Population
)
VALUES
(
    'Grantsville'
    , 'USA'
    , 'Utah'
    , 14417
);

INSERT INTO city (Name, CountryCode, District, Population)
VALUES ('Ogden', 'USA', 'Utah', 49987)
    , ('Murray', 'USA','Utah', 48752);
    
-- INVALID COUNTRY CODE cannot be inserted
-- Foreign Key constraint violation
INSERT INTO city (Name, CountryCode, District, Population)
VALUES ('Lunar View', 'ZZZ', 'Outlands', 49987);

-- get the last auto_increment id value
SELECT LAST_INSERT_ID();

SELECT *
FROM city
WHERE District = 'Utah'
