-- GET a list of 
-- all countries in north america (continent) or Europe
-- with a population greater than 10,000,000
-- include name, continent, region, population
-- sorted by population
use world;

-- use parnethesis to group where clauses ()
SELECT Name
    , Continent
    , Region
    , Population
FROM country
WHERE (Continent = 'North America' OR Continent = 'Europe')
    AND Population > 10000000
ORDER BY Population DESC;

