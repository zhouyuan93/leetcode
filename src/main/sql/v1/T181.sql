select name employee
from employee e1
where e1.managerId is not null
  and exists (select 1 from employee e2
  where e2.id = e1.managerId and e2.salary < e1.salary)