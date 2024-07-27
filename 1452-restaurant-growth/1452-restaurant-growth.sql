# Write your MySQL query statement below
select visited_on, amount, round(cast(amount as float)/7,2) as average_amount from (
select visited_on,
sum(total) over(order by visited_on rows 6 preceding) as amount
from(
select visited_on, sum(amount) as total
from customer
group by visited_on) as cc) as cc1
limit 100 offset 6
