package v1.t600;

import java.util.List;

public class T648 {
    class TrieNode {
        boolean isEnd = false;
        TrieNode[] children = new TrieNode[26];
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        for (String s : dictionary) {
            TrieNode node = root;
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.isEnd = true;
        }

        StringBuilder res = new StringBuilder();
        int i = 0;

        while (i < sentence.length()) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                i++;
                res.append(c);
                continue;
            }

            TrieNode node = root;
            boolean isHead = false;
            while ( i < sentence.length() && sentence.charAt(i) != ' ' ) {
                if (isHead) {
                    i++;
                    continue;
                }

                res.append(sentence.charAt(i));

                if (node == null) {
                    i++;
                    continue;
                }

                int idx = sentence.charAt(i) - 'a';
                node = node.children[idx];
                if (node!= null) {
                    isHead = node.isEnd;
                }
                i++;
            }

        }

        return res.toString();
    }
}
