# Write your MySQL query statement below

SELECT p.product_name, SUM(o.unit) as unit FROM Products as p JOIN Orders as o ON p.product_id = o.product_id WHERE o.order_date between '2020-02-01' and '2020-02-29' GROUP BY p.product_name HAVING unit >= 100;