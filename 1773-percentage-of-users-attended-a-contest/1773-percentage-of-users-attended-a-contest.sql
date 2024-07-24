# Write your MySQL query statement below
with userCount as(select count(*) as uc from users)
select contest_id, round((cast(count(*) as float) / u.uc)*100.0,2) as percentage
from register, userCount u
group by contest_id
order by 2 desc,1;