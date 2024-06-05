USE world;

-- when we want to aggregate some columns
-- but not all of them
-- we need to create groups for SQL to Tally the results
SELECT COUNT(*) AS CityCount -- any aggregated column is a "tally" column
    , SUM(Population) AS TotalPopulation
    , MIN(Population) AS SmallestCity
    , District AS State -- we must group on any non-aggregated column
FROM city
WHERE CountryCode = 'USA'
GROUP BY District -- the groups are defined AFTER the WHERE clause
;