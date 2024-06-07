use world;

-- check my filter
SELECT *
FROM city
WHERE Name = 'Murray';

-- delete city 
DELETE FROM city
WHERE Name = 'Murray';


-- to delete a country
-- I have to delete all cities
-- and country lnaguages first

DELETE FROM city
WHERE CountryCode = 'USA';

DELETE FROM countrylanguage
WHERE CountryCode = 'USA';

DELETE FROM country
WHERE Code = 'USA';

-- verify that the delete succeeded
SELECT *
FROM country
WHERE Code = 'USA' ;

SELECT *
FROM city
WHERE CountryCode = 'USA';


SELECT *
FROM CountryLanguage
WHERE CountryCode = 'USA';