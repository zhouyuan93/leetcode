select name customers
  from customers t
  where not exists (select 1 from orders where customerId = t.id)