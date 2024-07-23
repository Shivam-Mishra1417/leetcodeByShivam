# Write your MySQL query statement below

select department,employee, salary from (
select d.name as department, e.name as employee, e.salary as salary,
max(salary) over(partition by e.departmentId) as maxs
from employee e, department d
where e.departmentId = d.id
) as new
where salary = new.maxs;