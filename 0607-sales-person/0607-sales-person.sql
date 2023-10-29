# Write your MySQL query statement below

SELECT s.name FROM SalesPerson AS s WHERE s.name NOT IN(SELECT s.name FROM SalesPerson AS s JOIN Orders AS o ON o.sales_id = s.sales_id JOIN Company AS c ON o.com_id = c.com_id WHERE c.name = 'Red');