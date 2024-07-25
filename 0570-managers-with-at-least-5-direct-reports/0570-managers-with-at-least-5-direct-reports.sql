# Write your MySQL query statement below

select e2.name
from employee e1, employee e2
where e1.managerid = e2.id
group by e1.managerid,e2.name
having count(*) >= 5