package v1.t100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        List<HashSet<String>> beginList = new ArrayList<>();
        List<HashSet<String>> endList = new ArrayList<>();

        int size = wordList.size();
        boolean endFlag = wordList.remove(endWord);
        if (!endFlag) {
            return 0;
        }

        if (isNextWord(beginWord, endWord)) {
            return 2;
        }

        //init
        HashSet<String> first = new HashSet<>();
        first.add(beginWord);
        beginList.add(first);
        first = new HashSet<>();
        first.add(endWord);
        endList.add(first);

        //find
        while (wordList.size() != 0 && size != wordList.size()) {
            size = wordList.size();
            Integer floor = extendsList(wordList, beginList, endList, new HashSet<>());
            if (floor != null) {
                return floor;
            }
            floor = extendsList(wordList, endList, beginList, new HashSet<>());
            if (floor != null) {
                return floor;
            }
        }

        return 0;

    }

    private Integer extendsList(List<String> wordList, List<HashSet<String>> changeList, List<HashSet<String>> selectList, HashSet<String> temp) {
        for (HashSet<String> set : changeList) {
            Iterator<String> iter = set.iterator();
            while (iter.hasNext()) {
                String s = iter.next();
                for (int i = wordList.size() - 1; i >= 0; i--) {
                    String word = wordList.get(i);
                    if (isNextWord(s, word) ){
                        wordList.remove(i);
                        temp.add(word);
                        int floor = hasConnected(selectList, word);
                        if (floor > 0) {
                            return floor+1 + changeList.size();
                        }
                    }
                }
            }
        }
        changeList.add(temp);
        return null;
    }

    public int hasConnected(List<HashSet<String>> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            HashSet<String> set = list.get(i);
            Iterator<String> iter = set.iterator();
            while (iter.hasNext()) {
                String s = iter.next();
                if (isNextWord(s, target)) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public boolean isNextWord(String str, String next) {
        boolean oneTime = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != next.charAt(i)) {
                if (!oneTime) {
                    oneTime = true;
                } else {
                    return false;
                }
            }
        }
        return oneTime;
    }


}
