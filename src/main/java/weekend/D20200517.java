package weekend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D20200517 {
    public static void main(String[] args) {
        String s = "Leetcode is cool";

        System.out.println(arrangeWords(s));

    }

    public static String arrangeWords(String text) {
        char[] tChar = text.toCharArray();

        tChar[0] = Character.toLowerCase(tChar[0]);

        Map<Integer,StringBuilder> map = new HashMap<>();

        List<Integer> keys = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(char c : tChar){
            if(c == ' '){
                String word = sb.toString();
                if(!keys.contains(word.length())){
                    keys.add(word.length());
                    map.put(word.length(),new StringBuilder());
                }
                map.get(word.length()).append(" "+word);
                sb = new StringBuilder();
            }else{
                sb.append(c);
            }
        }

        String word = sb.toString();
        if(!keys.contains(word.length())){
            keys.add(word.length());
            map.put(word.length(),new StringBuilder());
        }
        map.get(word.length()).append(" "+word);
        sb = new StringBuilder();


        keys.sort(Comparator.naturalOrder());


        if(keys.size() > 0){
            StringBuilder first = map.get(keys.get(0));
            char s = first.charAt(1);
            first.deleteCharAt(0);
            first.deleteCharAt(0);
            first.insert(0,Character.toUpperCase(s));
        }

        StringBuilder result = new StringBuilder();

        for(Integer key : keys){
            result.append(map.get(key));
        }

        return result.toString();

    }
}
