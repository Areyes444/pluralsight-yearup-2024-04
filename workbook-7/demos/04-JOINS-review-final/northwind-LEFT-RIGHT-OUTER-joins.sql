use northwind;

SELECT p.ProductId
    , p.ProductName
    , COUNT(od.ProductId) AS TimesSold
FROM Products AS p
LEFT OUTER JOIN `order details` AS od
    ON p.ProductID = od.ProductID
GROUP BY p.ProductID, p.ProductName
ORDER BY p.ProductId;

-- show me all products that have never been purchased
SELECT p.ProductId
    , p.ProductName
    , od.productId
FROM Products AS p
LEFT OUTER JOIN `order details` AS od
    ON p.ProductID = od.ProductID
WHERE od.ProductID IS NULL;

-- give me a list of customers who have never placed an order
SELECT c.CustomerId
    , c.CompanyName
FROM Orders AS o
RIGHT OUTER JOIN Customers AS c
    ON c.CustomerId = o.CustomerId
WHERE o.CustomerId IS NULL;






