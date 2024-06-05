use world;

-- give me a list of countries 
-- with a life expectancy between 50 and 60

SELECT Name 
    , LifeExpectancy
FROM country
WHERE LifeExpectancy >= 50
    AND LifeExpectancy <= 60;
    

SELECT Name 
    , LifeExpectancy
FROM country
WHERE LifeExpectancy BETWEEN 50 AND 60;