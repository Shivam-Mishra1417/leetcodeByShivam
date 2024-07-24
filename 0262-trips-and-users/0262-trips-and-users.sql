# Write your MySQL query statement below

select distinct request_at as Day,
 round(cast(sum(case status when 'completed' then 0 else 1 end) over(partition by request_at) as float)/
 count(id) over(partition by request_at),2) as 'Cancellation Rate'
from trips t, users u1, users u2
where (t.client_id = u1.users_id and t.driver_id = u2.users_id)
and u1.banned!='Yes'
and u2.banned!='Yes'
and request_at between "2013-10-01" and "2013-10-03"
-- group by request_at