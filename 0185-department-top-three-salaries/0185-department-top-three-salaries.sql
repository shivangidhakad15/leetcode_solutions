# Write your MySQL query statement below


SELECT d.name as department, e1.name as employee, e1.salary as salary FROM Employee as e1 INNER JOIN Department as d ON e1.departmentId = d.id WHERE 3 > (SELECT COUNT(distinct e2.salary) FROM Employee as e2 WHERE e2.salary > e1.salary AND e1.departmentId = e2.departmentId);