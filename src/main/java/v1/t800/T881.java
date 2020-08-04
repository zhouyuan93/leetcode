package v1.t800;

import java.util.Arrays;

public class T881 {
    public int numRescueBoats(int[] people, int limit) {
        //排序
        Arrays.sort(people);

        //找到最后一个不超重的人
        int right = people.length - 1;
        int left = 0;
        int p = 0;
        while (right - left > 1) {
            p = (left + right) / 2;
            if (people[p] >= limit) {
                right = p;
            } else {
                left = p;
            }
        }

        //胖瘦匹配
        left = 0;
        while (right - left > 1) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
        }

        //最后两个人或一个人没有上船
        if (left != right && people[left] + people[right] <= limit) {
            left++;
        }

        return people.length - left;

    }
}
