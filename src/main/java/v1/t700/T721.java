package v1.t700;

import java.util.*;

public class T721 {
    class People{
        String name;
        HashSet<String> emails;

        public People(String name, HashSet<String> emails) {
            this.name = name;
            this.emails = emails;
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<People>> map = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);

            HashSet<String> set=new HashSet<>();
            List<People> list = map.getOrDefault(name, new ArrayList<>());

            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                set.add(email);
                removeSamePeople(list, email, set);
            }

            list.add(new People(name, set));
            map.put(name, list);
        }

        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<People>> entry : map.entrySet()) {
            for (People people : entry.getValue()) {
                List<String> list = new ArrayList<>();
                list.addAll(people.emails);
                list.sort(Comparator.naturalOrder());
                list.add(0,people.name);
                res.add(list);
            }
        }

        return res;
    }

    public void removeSamePeople(List<People> list, String email, HashSet<String> set) {
        for (int i = list.size() - 1; i >= 0; i--) {
            People people = list.get(i);
            if (people.emails.contains(email)) {
                list.remove(i);
                set.addAll(people.emails);
            }
        }
    }
}
