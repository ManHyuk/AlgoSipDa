# Write your MySQL query statement below
SELECT 
    EMP.name AS Employee 
FROM 
    Employee EMP,
    Employee MGR
WHERE 1 = 1 
    AND EMP.managerId = MGR.id
    AND EMP.salary > MGR.salary