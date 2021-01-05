package v1.t800;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T830 {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        if (s == null || s.length() < 3) {
            return res;
        }

        int begin = 0;
        int end = 0;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char x = s.charAt(i);
            if (c == x) {
                end++;
                continue;
            }

            if (end - begin >= 2) {
                res.add(Arrays.asList(begin, end));
            }

            begin = i;
            end = i;
            c = x;
        }

        if (end - begin >= 2) {
            res.add(Arrays.asList(begin, end));
        }

        return res;
    }
}
