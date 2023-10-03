# Write your MySQL query statement below
select id
from Weather w
where temperature > 
(select temperature
from Weather v
where datediff(w.recordDate, v.recordDate) = 1
);