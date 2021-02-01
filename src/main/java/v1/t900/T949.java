package v1.t900;

/**
 * @author yuan.zhou
 */
public class T949 {
    public static int[][] index = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}};

    public String largestTimeFromDigits(int[] arr) {
        int hour = -1;
        int min = 0;
        for (int i = 0; i < index.length; i++) {
            int tempHour = arr[index[i][0]] * 10 + arr[index[i][1]];
            if (tempHour < 24 && hour <= tempHour) {
                int tempMin = arr[index[5 - i][0]] * 10 + arr[index[5 - i][1]];
                if (tempMin < 60 && (tempHour > hour || tempMin > min)) {
                    hour = tempHour;
                    min = tempMin;
                }

                tempMin = arr[index[5 - i][0]] + arr[index[5 - i][1]] * 10;
                if (tempMin < 60 && (tempHour > hour || tempMin > min)) {
                    hour = tempHour;
                    min = tempMin;
                }
            }

            tempHour = arr[index[i][0]] + arr[index[i][1]] * 10;
            if (tempHour < 24 && hour <= tempHour) {
                int tempMin = arr[index[5 - i][0]] * 10 + arr[index[5 - i][1]];
                if (tempMin < 60 && (tempHour > hour || tempMin > min)) {
                    hour = tempHour;
                    min = tempMin;
                }

                tempMin = arr[index[5 - i][0]] + arr[index[5 - i][1]] * 10;
                if (tempMin < 60 &&(tempHour > hour || tempMin > min)) {
                    hour = tempHour;
                    min = tempMin;
                }

            }

        }

        StringBuilder res = new StringBuilder();
        if (hour != -1) {
            if (hour < 10) {
                res.append("0");
            }
            res.append(hour);
            res.append(":");
            if (min < 10) {
                res.append("0");
            }
            res.append(min);
        }

        return res.toString();

    }

}
