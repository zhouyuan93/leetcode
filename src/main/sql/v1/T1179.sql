SELECT id ,
sum(CASE WHEN month='Jan' THEN revenue END) Jan_Revenue,
sum(CASE WHEN month='Feb' THEN revenue END) Feb_Revenue,
sum(CASE WHEN month='Mar' THEN revenue END) Mar_Revenue,
sum(CASE WHEN month='Apr' THEN revenue END) Apr_Revenue,
sum(CASE WHEN month='May' THEN revenue END) May_Revenue,
sum(CASE WHEN month='Jun' THEN revenue END) Jun_Revenue,
sum(CASE WHEN month='Jul' THEN revenue END) Jul_Revenue,
sum(CASE WHEN month='Aug' THEN revenue END) Aug_Revenue,
sum(CASE WHEN month='Sep' THEN revenue END) Sep_Revenue,
sum(CASE WHEN month='Oct' THEN revenue END) Oct_Revenue,
sum(CASE WHEN month='Nov' THEN revenue END) Nov_Revenue,
sum(CASE WHEN month='Dec' THEN revenue END) Dec_Revenue
from
Department
group by id