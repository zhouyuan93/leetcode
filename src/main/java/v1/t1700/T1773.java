package v1.t1700;

import java.util.List;

public class T1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int) items.stream().filter(item -> {
            switch (ruleKey) {
                case "type":
                    return item.get(0).equals(ruleValue);
                case "color":
                    return item.get(1).equals(ruleValue);
                case "name":
                    return item.get(2).equals(ruleValue);
            }
            return false;
        }).count();
    }
}
