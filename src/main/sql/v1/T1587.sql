select u.name , sum(t.amount) balance
  from users u , transactions t
  where u.account = t.account
  group by t.account
  having sum(t.amount) > 10000