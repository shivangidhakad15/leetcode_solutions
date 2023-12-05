# Write your MySQL query statement below

SELECT person_name
FROM(
SELECT *, 
    SUM(weight) OVER (
        ORDER BY turn) 
    AS totalweight
    
FROM Queue
ORDER BY turn
) AS _turn

WHERE _turn.totalweight <=1000
ORDER BY _turn.totalweight DESC
LIMIT 1;