USE world;


SELECT COUNT(*) AS `Number Of Cities`
    , SUM(Population) AS `Total Population`
    , MIN(Population) AS `Smallest City`
    , MAX(Population) AS `Biggest City`
    , AVG(Population) AS `Average Population`
FROM city
WHERE District = 'Alabama'
;


-- sample query to see what data there is to work with
SELECT *
FROM city
WHERE District = 'Alabama'
;

-- distinct
-- count of the number of states 
SELECT COUNT(DISTINCT District) as `Number of States`
    , COUNT(*) AS `Number of Cities`
FROM city
WHERE CountryCode = 'USA';

--
SELECT COUNT(*) AS `Total Countries`
    , COUNT(IndepYear) AS `Independent Countries`
FROM Country;

SELECT *
FROM Country;

