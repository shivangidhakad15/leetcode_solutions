# Write your MySQL query statement below

# SELECT e2.name FROM Employee as e1 INNER JOIN Employee as e2 ON e2.id = e1.managerID GROUP BY e2.id HAVING COUNT(e2.id) >= 5;

SELECT name FROM Employee WHERE id IN (SELECT managerID FROM Employee GROUP BY managerID HAVING COUNT(managerID) >= 5);