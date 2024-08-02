# Write your MySQL query statement below

select * from users 
where mail regexp '^[a-zA-Z][\\w\.-]*@leetcode\\.com$';