# Write your MySQL query statement below
SELECT IF(IF(id % 2 = 0, id - 1, id + 1) IN (SELECT id FROM Seat), IF(id % 2 = 0, id - 1, id + 1), id) AS id, student FROM Seat ORDER BY id;