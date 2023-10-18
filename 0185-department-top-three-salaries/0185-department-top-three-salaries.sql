# Write your MySQL query statement below


SELECT d.name as department, e.name as employee, e.salary as salary FROM Employee as e JOIN Department as d ON e.departmentId = d.id WHERE 3 > (SELECT COUNT(distinct(e1.salary)) FROM Employee as e1 WHERE e1.salary > e.salary AND e.DepartmentId = e1.DepartmentId);