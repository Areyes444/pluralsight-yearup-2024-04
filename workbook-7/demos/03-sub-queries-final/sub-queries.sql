use northwind;

SELECT 
    AVG(UnitPrice) - 5 as LowEdge
    , AVG(UnitPrice) + 5 as HighEdge
FROM Products;

SELECT ProductName
FROM Products
WHERE UnitPrice between 24 AND 34;


SELECT ProductName
FROM Products
WHERE UnitPrice between 
    (SELECT AVG(UnitPrice) - 5  FROM Products) -- sub-query to find the bottom of the range
    AND 
    (SELECT AVG(UnitPrice) + 5  FROM Products); -- sub-query to find the top of the range


SELECT ProductName
    , UnitPrice
FROM Products
WHERE UnitPrice = (
    -- sub query finds the lowest price
    -- and provides a filter for the outer query
    SELECT MIN(UnitPrice)
    FROM Products
);


-- find all products that are more expensive 
-- than the average price

SELECT *
FROM Products
WHERE UnitPrice > (
    SELECT AVG(UnitPrice)
    FROM Products
)
ORDER BY UnitPrice;



SELECT ProductName
    , UnitPrice AS Price
FROM Products
ORDER BY UnitPrice
LIMIT 1;