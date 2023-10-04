# Write your MySQL query statement below

SELECT eu.unique_id as unique_id, e.name as name FROM Employees as e LEFT JOIN EmployeeUNI as eu ON e.id = eu.id; 