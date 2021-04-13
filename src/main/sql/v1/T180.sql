select distinct l1.num as ConsecutiveNums
from logs l1, logs l2 , logs l3
where l2.id = l1.id + 1
  and l3.id = l1.id + 2
  and l1.num = l2.num
  and l2.num = l3.num