# Write your MySQL query statement below
select * from
(select 
employee_id, name,
(select count(*) from employees e1 where e.employee_id = e1.reports_to)as reports_count ,
(select round(avg(age)) from employees e2 where e.employee_id = e2.reports_to) as average_age  
from employees e) e3
where reports_count>0
order by employee_id ;