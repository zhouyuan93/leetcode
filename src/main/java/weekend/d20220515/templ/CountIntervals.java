package weekend.d20220515.templ;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class CountIntervals {

    int count = 0;

    List<Integer> leftList = new ArrayList<>();
    List<Integer> rightList = new ArrayList<>();

    public CountIntervals() {

    }

    public void add(int left, int right) {
        if (leftList.size() == 0) {
            count += (right - left + 1);
            leftList.add(left);
            rightList.add(right);
            return;
        }

        int l = search(leftList, left);
        int r = search(rightList, right);
        if (leftList.get(l) <= left && left <= rightList.get(l) ) {
            left = l;
        }

        if (rightList.get(r) == right) {

        }

        for (int i = r; i >= l; i--) {
            remove(i);
        }

        count += (right - left + 1);
        leftList.add(l,left);
        rightList.add(l,right);
    }

    public void remove(int i) {
        int l = leftList.remove(i);
        int r = rightList.remove(i);
        count -= (r - l + 1);
    }
    public int search(List<Integer> list, int x) {
        int left = 0;
        int right = list.size();

        while (right-1 > left) {
            int mid = (right + left) / 2;
            int p = list.get(mid);

            if (p > x) {
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }

    public int count() {
        return count;
    }


}
