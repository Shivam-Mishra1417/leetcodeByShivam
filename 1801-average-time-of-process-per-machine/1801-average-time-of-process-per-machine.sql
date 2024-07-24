# Write your MySQL query statement below

select distinct a.machine_id
,round(
    (sum(case activity_type when 'end' then timestamp else 0 end) over(partition by machine_id) -
sum(case activity_type when 'start' then timestamp else 0 end) over(partition by machine_id))/
(count(machine_id) over(partition by machine_id)/2),3) as processing_time
from activity a
order by 1, a.process_id