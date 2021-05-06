package v1.mst;

public class MST10_05 {
    public int findString(String[] words, String s) {
        int begin = 0;
        String beginStr = "";
        for (int i = 0; i < words.length; i++) {
            if (!"".equals(words[i])) {
                begin = i;
                beginStr = words[i];
                break;
            }
        }
        int temp = compared(s, beginStr);
        if (temp == 0) {
            return begin;
        } else if (temp < 0) {
            return -1;
        }

        int end = words.length - 1;
        String endStr = "";
        for (int i = words.length - 1; i >= begin; i--) {
            if (!"".equals(words[i])) {
                end = i;
                endStr = words[i];
                break;
            }
        }
        temp = compared(s, endStr);
        if (temp == 0) {
            return end;
        } else if (temp > 0) {
            return -1;
        }


        while (begin + 1 < end) {

            int mid = (begin + end) / 2;

            if ("".equals(words[mid])) {
                int midRight = -1;
                for (int i = mid; i < end; i++) {
                    if (!"".equals(words[i])) {
                        midRight = i;
                    }
                }
                if (midRight != -1) {
                    temp = compared(s, words[midRight]);
                    if (temp > 0) {
                        begin = midRight;
                        continue;
                    } else if (temp < 0) {
                        end = midRight;
                    }else{
                        return midRight;
                    }
                }


                int midLeft = -1;
                for (int i = mid; i > begin; i--) {
                    if (!"".equals(words[i])) {
                        midLeft = i;
                    }
                }
                if (midLeft != -1) {
                    temp = compared(s, words[midLeft]);
                    if (temp < 0) {
                        end = midLeft;
                    } else if (temp > 0) {
                        begin = midLeft;
                    }else{
                        return midLeft;
                    }
                }

                if (midLeft == -1 && midRight == -1) {
                    return -1;
                }

            } else {
                temp = compared(s, words[mid]);
                if (temp == 0) {
                    return mid;
                } else if (temp > 0) {
                    begin = mid;
                }else{
                    end = mid;
                }
            }
        }

        return -1;

    }

    public int compared(String x, String y) {
        if (x.length() > y.length()) {
            return -compared(y, x);
        }

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < y.charAt(i)) {
                return -1;
            } else if (x.charAt(i) > y.charAt(i)) {
                return 1;
            }
        }

        if (x.length() == y.length()) {
            return 0;
        } else {
            return -1;
        }
    }
}
