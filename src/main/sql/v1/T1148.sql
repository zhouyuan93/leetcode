SELECT distinct author_id as id
FROM VIEWS
WHERE AUTHOR_ID = VIEWER_ID
order by author_id
