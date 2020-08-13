package v1.t1100;

/**
 * @author yuan.zhou
 */
public class T1154 {
    public static final int[] monthOfDay = {31,59,90,120,151,181,212,243,273,304,334,365};

    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.valueOf(split[0]);
        int month = Integer.valueOf(split[1]) - 1;
        int day = Integer.valueOf(split[2]);

        int res = month == 0 ? 0 : monthOfDay[month-1];

        if (month > 1 && getIsLeapYear(year)) {
            res += 1;
        }

        res += day;

        return res;

    }

    public boolean getIsLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
