USE northwind;

SELECT od.OrderId 
    , od.ProductID
    , p.ProductName
    , od.UnitPrice
FROM `order details` AS od
JOIN products AS p 
    ON od.ProductID = p.productID