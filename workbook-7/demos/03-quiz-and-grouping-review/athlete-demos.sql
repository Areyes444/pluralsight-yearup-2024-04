USE sports;

SELECT *
FROM athletes
ORDER BY last_name DESC
    , first_name;
    
-- GROUP BY creates 3 groups - one for each event
-- COUNT(*)  counts the number of rows in each group
SELECT event
    , COUNT(*) 
FROM athletes
GROUP BY event;

-- ALL events that have more than 1 athlete
SELECT event
    , COUNT(*) AS athlete_count
FROM athletes
GROUP BY event
HAVING COUNT(*) > 1; -- HAVING filters by group