/* Write your PL/SQL query statement below */
select nvl(e.employee_id,s.employee_id) as employee_id
from employees e full  join salaries s
on e.employee_id = s.employee_id
 where e.employee_id is null
 or s.employee_id is null
 order by 1;