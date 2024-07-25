# Write your MySQL query statement below
SELECT employee_id, department_id
from employee e
where not exists
(select * from employee e1 
where e.employee_id = e1.employee_id and e.department_id!=e1.department_id)
union
select employee_id, department_id
from employee 
where primary_flag ='Y'