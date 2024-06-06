use northwind;

-- sub-query to find product detail
SELECT OrderId
    , ProductID
    , (
        -- correlated sub-query
        -- query the products table for the ProductName
        SELECT ProductName
        FROM products AS p
        -- filter on ProductID from the current row(in the outer query)
        WHERE p.ProductID = od.ProductID
    ) AS ProductName
    , UnitPrice
    , Quantity
    , Discount
FROM `order details` AS od