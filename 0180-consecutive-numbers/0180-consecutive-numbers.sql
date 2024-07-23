# Write your MySQL query statement below

select distinct num as ConsecutiveNums from
(select num, id,lead(num) over(order by id) as next1, lead(num,2) over(order by id) as next2,
lead(id) over() as next1id, leaD(id,2) over() as next2id
from logs
) new
where num=new.next1 and new.next1=new.next2
and id+1=next1id and id+2=next2id;
