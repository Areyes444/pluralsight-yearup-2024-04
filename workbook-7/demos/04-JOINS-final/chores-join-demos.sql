use chores;

SELECT *
FROM person;

SELECT *
FROM task;

-- INNER JOIN include ONLY rows that have relationships
-- from BOTH tables
SELECT p.person_name
    , t.task_name
FROM person AS p 
INNER JOIN task AS t
    on p.person_id = t.person_id;
    
    
-- LEFT join includes ALL rows from the LEFT table
SELECT p.person_name
    , t.task_name
FROM person AS p 
LEFT OUTER JOIN task AS t
    on p.person_id = t.person_id;
    
    
-- Give me a list of anyone 
-- without a task
SELECT p.person_name
    , t.task_name
FROM person AS p 
LEFT OUTER JOIN task AS t
    on p.person_id = t.person_id
WHERE task_name IS NULL;
    
    
-- RIGHT join includes ALL rows from the RIGHT table
SELECT p.person_name
    , t.task_name
FROM person AS p 
RIGHT OUTER JOIN task AS t
    on p.person_id = t.person_id;
    

    
-- FULL join includes ALL rows from BOTH tables
-- MySQL does not support FULL JOIN
-- so you have to execute 2 queries (LEFT and RIGHT) and merge them
SELECT p.person_name
    , t.task_name
FROM person AS p 
LEFT OUTER JOIN task AS t
    on p.person_id = t.person_id
    
UNION
    
SELECT p.person_name
    , t.task_name
FROM person AS p 
RIGHT OUTER JOIN task AS t
    on p.person_id = t.person_id;