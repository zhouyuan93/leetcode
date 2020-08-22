package v1.t600;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T679 {
    static final double THRESHOLD = 1e-6;
    static final double TARGET = 24;

    static final int ADD = 0, MULTIPLY = 1 , SUBTRACT = 2, DIVIDE = 3;

    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<>();
        for (int num : nums) {
            list.add((double) num);
        }
        return calc(list);
    }

    public boolean calc(List<Double> list) {
        if (list.size() == 0) {
            return false;
        }
        if (list.size() == 1) {
            return Math.abs(list.get(0) - TARGET) < THRESHOLD;
        }
        int len = list.size();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len ; j++) {
                if (i == j) {
                    continue;
                }

                List<Double> list2 = new ArrayList<>(len - 2);
                for (int k = 0; k < len; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    list2.add(list.get(k));
                }

                //四种计算方式
                for (int k = 0; k < 4; k++) {
                    //加乘
                    if (k < 2 && i > j) {
                        continue;
                    }

                    switch (k) {
                        case ADD:
                            list2.add(list.get(i) + list.get(j));
                            break;
                        case MULTIPLY:
                            list2.add(list.get(i) * list.get(j));
                            break;
                        case DIVIDE:
                            if (Math.abs(list.get(j)) < THRESHOLD) {
                                continue;
                            }
                            list2.add(list.get(i) / list.get(j));
                            break;
                        case SUBTRACT:
                            list2.add(list.get(i) - list.get(j));
                            break;
                    }
                    if (calc(list2)) {
                        return true;
                    }
                    list2.remove(len - 2);
                }
            }
        }

        return false;

    }

}
