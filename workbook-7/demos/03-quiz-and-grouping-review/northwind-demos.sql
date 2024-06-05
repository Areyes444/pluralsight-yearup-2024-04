USE northwind;

-- where filters ROWS
SELECT CompanyName AS Customer
FROM Customers
WHERE Country = 'Germany';

-- AS keyword changes the column name
-- you can perform arithmetic for each column
SELECT OrderId
    , ProductId
    , UnitPrice AS Price
    , Quantity
    , UnitPrice * Quantity AS Total
FROM `Order Details`;

-- CONCAT() is an ANSI function that allows you to 
-- combine strings
SELECT CONCAT(FirstName, ' ', LastName) AS FullName
FROM Employees;




-- 1) all line items with a line total
SELECT OrderId
    , UnitPrice * Quantity AS LineTotal
FROM `Order Details`;

-- 2) sum the line total
-- this gives the ONE lump sum total of all orders
SELECT Sum(UnitPrice * Quantity) AS OrderTotal
FROM `Order Details`;

-- 3) -- I want the total of EACH order
-- I need to GROUP BY OrderID
SELECT OrderId
    , Sum(UnitPrice * Quantity) AS OrderTotal
FROM `Order Details`
GROUP BY OrderId;


-- 4) -- I want only those orders that have a total > 2000
-- I need a HAVING filter
SELECT OrderId
    , Sum(UnitPrice * Quantity) AS OrderTotal
FROM `Order Details`
GROUP BY OrderId
HAVING SUM(UnitPrice * Quantity) > 2000;
