# Write your MySQL query statement below
select person_name as person_name from (
select q.person_name,q.weight,
sum(weight) over(order by turn rows unbounded preceding) as cum_sum 
from queue q
) as qq
where cum_sum<=1000
order by cum_sum desc
limit 1
