package v1.t1700;

import java.util.ArrayList;
import java.util.List;

public class T1742 {
    public static class BrowserHistory {

        List<String> list = new ArrayList<>(1000);
        int p = 0;
        int right = 0;

        public BrowserHistory(String homepage) {
            list.add(homepage);
        }

        public void visit(String url) {
            p++;
            if (list.size() > p) {
                list.set(p, url);
            }else{
                list.add(url);
            }
            right = p;
        }

        public String back(int steps) {
            p = Math.max(0, p - steps);
            return list.get(p);
        }

        public String forward(int steps) {
            p = Math.min(right, p + steps);
            return list.get(p);
        }
    }
}
