# Write your MySQL query statement below
with sc as(
select s.user_id, s.time_stamp as signup_time, c.time_stamp, c.action
from signups s left join confirmations c
on s.user_id = c.user_id)
select user_id, 
round(cast(sum(case when action='confirmed' then 1 else 0 end) as float)/
count(*),2) as confirmation_rate 
from sc
group by 1;