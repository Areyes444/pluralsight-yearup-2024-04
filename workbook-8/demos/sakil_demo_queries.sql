use sakila;

-- list of all categories
SELECT category_id
    , name
FROM category;

-- list of all films
SELECT film_id
    , title
    , description
    , release_year
    , length
FROM film;

-- list of films by category_id
SELECT f.film_id
    , f.title
    , f.description
    , f.release_year
    , f.length
FROM film AS f
INNER JOIN film_category AS fc
    ON f.film_id = fc.film_id
WHERE fc.category_id = 3 ;

-- list of actors by film_id
SELECT a.actor_id
    , a.first_name
    , a.last_name
FROM actor AS a
INNER JOIN film_actor AS fa
    ON a.actor_id = fa.actor_id
WHERE fa.film_id = 59;