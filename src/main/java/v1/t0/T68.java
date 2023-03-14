package v1.t0;

import java.util.ArrayList;
import java.util.List;

public class T68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();

        int l = 0;
        int x = maxWidth;
        for (int i = 0; i < words.length; i++) {
            if (x >= words[i].length()) {
                x -= words[i].length() + 1;
            }else{
                x++;
                int c = i - l-1;

                int space;
                int add;
                if (c == 0) {
                    space = x;
                    add = 0;
                }else {
                    space = x / c + 1;
                    add = x % c;
                }
                StringBuilder sb = new StringBuilder();
                for (int j = l; j < i-1; j++) {
                    sb.append(words[j]);
                    for (int m = 0; m < space; m++) {
                        sb.append(" ");
                    }
                    if (add > 0) {
                        add--;
                        sb.append(" ");
                    }
                }
                sb.append(words[i-1]);
                if (c == 0) {
                    for (int m = 0; m < space; m++) {
                        sb.append(" ");
                    }
                }
                res.add(sb.toString());
                l = i;
                x = maxWidth - words[i].length() - 1;
            }
        }

        StringBuilder temp = new StringBuilder();
        for (int i = l; i < words.length; i++) {
            temp.append(words[i]);
            temp.append(" ");
        }
        if (temp.length() > maxWidth) {
            temp.deleteCharAt(temp.length() - 1);
        }else{
            for (int i = temp.length(); i < maxWidth; i++) {
                temp.append(" ");
            }
        }
        res.add(temp.toString());

        return res;
    }
}
