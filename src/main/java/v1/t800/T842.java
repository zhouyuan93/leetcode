package v1.t800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T842 {
    public List<Integer> splitIntoFibonacci(String S) {
        if (S == null || S.length() < 3) {
            return new ArrayList<>();
        }

        int[][] memory = new int[S.length()][S.length()];

        for (int i = 0; i < S.length(); i++) {
            int x = S.charAt(i) - '0';
            memory[i][i] = x;
        }

        for (int move = 1; move < S.length(); move++) {
            for (int begin = move, end = 0; end < S.length() - move; end++, begin++) {
                int left = memory[end][begin-1];
                if (left == 0 || left == -1) {
                    memory[end][begin] = -1;
                    continue;
                }
                int down = memory[begin][begin];
                int value = left * 10 + down;
                if (value < 0) {
                    value = -1;
                }
                memory[end][begin] = value;
            }
        }

        int maxLen = (S.length() + 2) / 3 * 2;
        maxLen = Math.min(10, maxLen);

        for (int secondEnd = 1; secondEnd < maxLen; secondEnd++) {
            for (int firstEnd = 0; firstEnd < secondEnd; firstEnd++) {
                int first = memory[0][firstEnd];
                int second = memory[firstEnd + 1][secondEnd];

                List<Integer> list = new ArrayList<>();
                list.add(first);
                list.add(second);

                int begin = firstEnd;
                int end = secondEnd;
                while (begin < S.length()) {
                    int third = first + second;
                    list.add(third);

                    int thirdLen = getIntegerLen(third);
                    begin = end + 1;
                    end = begin + thirdLen - 1;

                    if (end >= memory[0].length) {
                        break;
                    }

                    if (memory[begin][end] != third) {
                        break;
                    }

                    if (end == memory.length - 1) {
                        return list;
                    }

                    first = second;
                    second = third;
                }


            }
        }

        return new ArrayList<>();
    }

    public int getIntegerLen(int x) {
        int res = 1;
        while (x > 9) {
            res++;
            x /= 10;
        }
        return res;
    }

}
