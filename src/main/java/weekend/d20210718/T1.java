package weekend.d20210718;

public class T1 {
    public int canBeTypedWords(String t, String b) {
        String[] s1 = t.split(" ");
        if (b.length() == 0) {
            return s1.length;
        }

        int[] x = new int[26];

        for (int i = 0; i < b.length(); i++) {
            x[b.charAt(i) - 'a']++;
        }


        int count = 0;
        for (String s : t.split(" ")) {

            boolean v = true;
            for (int i = 0; i < s.length(); i++) {
                if (x[s.charAt(i) - 'a'] > 0) {
                    v = false;
                    break;
                }
            }

            if (v) {
                count++;
            }

        }

        return count;

    }
}
