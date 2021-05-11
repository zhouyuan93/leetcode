select td.name Department, te.name employee, te.salary
from Employee te,
     Department td,
     (select DepartmentId, Max(salary) salary from Employee group by DepartmentId) ts
where te.DepartmentId = td.id
  and te.salary >= ts.salary
  and te.DepartmentId = ts.DepartmentId