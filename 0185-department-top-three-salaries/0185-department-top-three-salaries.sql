# Write your MySQL query statement below


SELECT d.name AS department, e1.name AS employee, e1.salary AS salary FROM Employee AS e1 INNER JOIN Department AS d ON e1.departmentId = d.id WHERE 3 > (SELECT COUNT(DISTINCT e2.salary) FROM Employee AS e2 WHERE e2.salary > e1.salary AND e1.departmentId = e2.departmentId);