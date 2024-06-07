use northwind;

DELETE FROM `order details`
WHERE ProductID in(61,7,49,52,71,34,77,37,30,24,3);

DELETE FROM `order details`
WHERE OrderId IN(
    SELECT OrderId
    FROM Orders
    WHERE CustomerId IN('HUNGO','Val2 ','VALON','WOLZA','QUICK','QUEDE','RICAR')
);

DELETE FROM Orders
WHERE CustomerId IN('HUNGO','Val2 ','VALON','WOLZA','QUICK','QUEDE','RICAR');
