# Write your MySQL query statement below

SELECT e.employee_id FROM Employees as e LEFT JOIN Salaries as s ON e.employee_id = s.employee_id WHERE s.salary is null
UNION
SELECT s.employee_id FROM Salaries as s LEFT JOIN Employees as e ON e.employee_id = s.employee_id WHERE e.name is null 
ORDER BY employee_id;