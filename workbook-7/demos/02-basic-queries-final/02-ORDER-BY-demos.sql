-- GET a list of all countries in north america (continent)
-- include name, continent, region, population
-- sorted by population
use world;

SELECT Name
    , Continent
    , Region
    , Population
FROM country
WHERE Continent = 'North America'
ORDER BY Population DESC;