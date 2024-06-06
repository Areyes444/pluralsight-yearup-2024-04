USE northwind;

SELECT *
-- step 1 - join all tables
FROM Customers AS c -- 11 cols: 93 rows
JOIN Orders AS o  -- 14 cols: 830 rows
    ON c.CustomerId = o.CustomerId
-- end step 1 (25 cols: 830 rows)
-- start step 2 - filter by customerId
WHERE c.CustomerId = 'ALFKI'
-- end step 2 ( 25 cols: 6 rows)
;

SELECT c.CustomerId                 -- 4. define which columns to return
    , c.CompanyName
    , o.OrderId
    , o.OrderDate
FROM Customers AS c                 -- 1. get all rows from the customers table
JOIN Orders AS o                    -- 2. get all rows from the orders table  and join to the customers data  
    ON c.CustomerId = o.CustomerId      -- 2a. instruct how to join the tables
WHERE c.CustomerId = 'ALFKI';       -- 3. filter and keep only rows that match this statement



-- REPORT: All order details for Alfred
-- Customer name
-- Order Id
-- Order Date
-- Product Price
-- Product Quantity
-- Line Total
-- Product Name
SELECT c.CompanyName AS `Customer Name`
    , o.OrderId AS `Order Id`
    , o.OrderDate AS `Order Date`
    , od.UnitPrice AS `Sales Price`
    , od.Quantity
    , od.UnitPrice * od.Quantity AS `Line Total`
    , p.ProductName AS `Product Name`
FROM Customers AS c
INNER JOIN Orders AS o ON c.CustomerId = o.CustomerId
INNER JOIN `order details` AS od ON o.OrderId = od.OrderId
INNER JOIN Products AS p ON od.ProductId = p.ProductId
WHERE c.CustomerId = 'ALFKI';

