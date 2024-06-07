-- 1)the table that holds the items Northwind sells is the products table 
use northwind;

select *
from products;

-- 2)query list of the product id, product name, and unit price of every product 
select `ProductId`, `ProductName`, `UnitPrice`
from PRODUCTS;

-- 3)query list of the product id, product name, and unit price of every product but by ascending order by price
select `ProductId`, `ProductName`, `UnitPrice`
from products
ORDER BY `UnitPrice` ASC;

-- 4) products that we carry that are $7.50 or less
select `ProductId`, `ProductName`, `UnitPrice`
from products
where `UnitPrice` <= 7.50;

-- 5)products that we carry that have at least 100 units in hand order by price in desc order
select `ProductId`, `ProductName`,`UnitPrice`, `UnitsInStock`
from products
where `UnitsInStock` >= 100 
order by `UnitPrice` desc;

-- 6)products that we carry with at least 100 units in hand desc order by price, if same price order by ascending order by product name 
select `ProductId`, `ProductName`,`UnitPrice`, `UnitsInStock`
from products
where `UnitsInStock` >= 100 
order by `UnitPrice` desc, `ProductName` asc;

-- 7)products that we carry were theres no units but 1 or more units on back order and order by product name
select `ProductId`, `ProductName`, `UnitsInStock`, `UnitsOnOrder`
from products
where `UnitsInStock`= 0 and `UnitsOnOrder` > 1
order by `ProductName` ASC;

-- 8)What is the table that holds the types(categories) of the items NorthWind sells 
Select `ProductName`, `CategoryId`
from products
order by `CategoryId`

-- 9) List all of the columns and rows of the category table 