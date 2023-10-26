# Write your MySQL query statement below

SELECT e.name AS Employee FROM Employee AS m INNER JOIN Employee AS e ON m.id = e.managerId WHERE e.salary > m.salary;