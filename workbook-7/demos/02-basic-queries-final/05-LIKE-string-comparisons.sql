use sakila;

-- I want a list of all actors
-- whose last name starts with G

SELECT *
FROM actor
WHERE last_name BETWEEN 'G' AND 'H';

-- start with G
SELECT *
FROM actor
WHERE last_name LIKE 'G%';

-- ends with G
SELECT *
FROM actor
WHERE last_name LIKE '%G';

-- contains G
SELECT *
FROM actor
WHERE last_name LIKE '%G%';

-- start with G and has 4 more letters
SELECT actor_id
    , first_name
    , last_name
FROM actor
WHERE last_name LIKE 'G____';

