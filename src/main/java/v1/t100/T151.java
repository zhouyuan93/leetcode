package v1.t100;

/**
 * @author yuan.zhou
 */
public class T151 {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();

        String[] words = s.split(" ");

        for (String word : words) {
            if (word == null || "".equals(word)) {
                continue;
            }
            builder.insert(0, word + " ");
        }

        return builder.length() > 0 ? builder.substring(0, builder.length() - 1) : "";

    }
}
