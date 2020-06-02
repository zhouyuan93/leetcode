select w2.id
  from weather w1 , weather w2
  where w1.RecordDate = w2.RecordDate-1
    and w2.Temperature > w1.Temperature