use world;

-- give me a list of all countries
-- who have declared independence
-- name, independence year

-- IS NULL finds all rows without an IndepYear value (null)
SELECT Name
    , IndepYear
FROM country
WHERE IndepYear IS NULL;

-- IS NOT NULL finds all rows with an IndepYear value
SELECT Name
    , IndepYear
FROM country
WHERE IndepYear IS NOT NULL;