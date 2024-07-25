# Write your MySQL query statement below

select id, visit_date, people from ( 
select id, visit_date, people,
lag(people) over(order by id) as people11,
lag(people,2) over(order by id) as people22,
lead(people) over(order by id) as people1,
lead(people,2) over(order by id) as people2
from stadium) as a
where people >= 100
and ((people1 >= 100 and people2 >= 100)
or (people11 >= 100 and people22 >= 100)
or(people1 >= 100 and people11 >= 100))
order by visit_date