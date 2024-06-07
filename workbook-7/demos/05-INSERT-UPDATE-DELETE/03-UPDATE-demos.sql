use world;

SELECT *
FROM city
WHERE ID = 4080;

UPDATE city
SET population = population + 1321
    , District = 'Utah'
WHERE ID = 4080;