USE world;

-- give me a list of all countries
-- in which I have at least one city

-- all Unique Countries
SELECT DISTINCT CountryCode AS Country
FROM city;

-- all Unique Country + State combinations
SELECT DISTINCT 
    CountryCode AS Country
    , District AS State
FROM city
ORDER BY Country
    , State;