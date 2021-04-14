package v1.t200;

import java.util.HashMap;

public class T208 {
    class Trie {

        boolean end ;
        HashMap<Character, Trie> children;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            children = new HashMap<>();
            end = false;
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                }else {
                    Trie child = new Trie();
                    node.children.put(c, child);
                    node = child;
                }
            }
            node.end = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                }else{
                    return false;
                }
            }
            return node.end;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Trie node = this;
            for (char c : prefix.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                }else{
                    return false;
                }
            }
            return true;
        }
    }
}
