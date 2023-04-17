package v1.t2400;

public class T2490 {
    private int[] m = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = getDay(arriveAlice);
        int ba = getDay(arriveBob);

        int a = Math.max(aa, ba);

        int al = getDay(leaveAlice);
        int bl = getDay(leaveBob);

        int l = Math.min(al, bl);

        return Math.max(0, l - a + 1);
    }

    private int getDay(String s) {
        return m[Integer.parseInt(s.substring(0, 2))] + Integer.parseInt(s.substring(3, 5));
    }
}
