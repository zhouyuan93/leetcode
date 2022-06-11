package weekend.d20220605;

import java.util.LinkedList;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
        TextEditor text = new TextEditor();
        text.addText("leetcode");
        System.out.println(text.deleteText(4));
        text.addText("practice");
        System.out.println(text.cursorRight(3));
        System.out.println(text.cursorLeft(8));
        System.out.println(text.deleteText(10));
        System.out.println(text.cursorLeft(2));
        System.out.println(text.cursorRight(6));
    }

    static class TextEditor {

        StringBuilder sb = new StringBuilder();
        int p = 0;

        public TextEditor() {

        }

        public void addText(String text) {
            sb.insert(p, text);
            p += text.length();
        }

        public int deleteText(int k) {
            int count = Math.min(p, k);
            int begin = Math.max(p - k, 0);
            sb.delete(begin, p);
            p = begin;
            return count;
        }

        public String cursorLeft(int k) {
            p = Math.max(p - k, 0);
            return sb.substring(p - Math.min(10, p), p);
        }

        public String cursorRight(int k) {
            p = Math.min(p + k, sb.length());
            return sb.substring(p - Math.min(10, p), p);
        }
    }
}
