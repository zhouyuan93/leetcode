package v1.t1300;

public class T1347 {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        int dif = 0;
        for (int i : count) {
            dif += Math.abs(i);
        }

        return dif / 2;
    }
}
