# Write your MySQL query statement below
select department,employee, salary from (
select d.name as department, e.name as employee, e.salary as salary,
dense_rank() over(partition by e.departmentId order by e.salary desc) as maxs
from employee e, department d
where e.departmentId = d.id
) as new
where new.maxs<4;