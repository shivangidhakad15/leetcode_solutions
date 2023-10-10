# Write your MySQL query statement below

SELECT p.product_name, SUM(o.unit) as unit FROM Products as p JOIN Orders as o ON p.product_id = o.product_id WHERE MONTH(o.order_date) = '02' AND YEAR(o.order_date) = '2020'GROUP BY p.product_name HAVING unit >= 100;