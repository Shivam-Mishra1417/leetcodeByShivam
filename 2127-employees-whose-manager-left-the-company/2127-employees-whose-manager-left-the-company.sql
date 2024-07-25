# Write your MySQL query statement below

select e1.employee_id
from employees e1
where not exists(select * from employees e2 where e1.manager_id = e2.employee_id)
and e1.salary < 30000
and e1.manager_id is not null
order by e1.employee_id;