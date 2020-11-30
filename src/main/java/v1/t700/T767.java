package v1.t700;

/**
 * @author yuan.zhou
 */
public class T767 {
    public String reorganizeString(String S) {
        int[] statistics = new int[26];
        for (char c : S.toCharArray()) {
            statistics[c - 'a']++;
        }

        int maxLenIndex = 0;
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] > statistics[maxLenIndex]) {
                maxLenIndex = i;
            }
        }

        int maxLen = statistics[maxLenIndex];
        if ( (maxLen - 1)*2 + 1 > S.length()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        statistics[maxLenIndex] = 0;
        for (int i = 0; i < maxLen; i++) {
            res.append((char) ('a' + maxLenIndex));
        }

        while (res.length() < S.length()) {
            int insertIndex = res.length() - 1;
            for (int j = 0; j < statistics.length; j++) {
                char x = (char) ('a' + j);
                while (statistics[j] > 0) {
                    res.insert(insertIndex, x);
                    statistics[j]--;
                    insertIndex--;
                    if (insertIndex < 0) {
                        break;
                    }
                }
                if (insertIndex < 0) {
                    break;
                }
            }
        }

        return res.toString();

    }
}
