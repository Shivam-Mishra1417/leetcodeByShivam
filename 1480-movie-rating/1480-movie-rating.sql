# Write your MySQL query statement below
with movie as(select 
u.name,m.title, mr.rating, mr.created_at
from movierating mr, users u, movies m
where mr.movie_id = m.movie_id
and mr.user_id = u.user_id order by mr.movie_id)
(
select name as results
from movie
group by name
order by count(*) desc, name
limit 1
)
union all
(
select title as results
from movie
where created_at between '2020-02-01' and '2020-02-29'
group by title
order by avg(rating) desc, title
limit 1
)