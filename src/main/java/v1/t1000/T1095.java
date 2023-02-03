package v1.t1000;

public class T1095 {
    interface MountainArray {
        int get(int index);

        int length();
    }

    private int TOP_INDEX = -1;

    public int findInMountainArray(int target, MountainArray mountainArr) {

        if (TOP_INDEX == -1) {
            findTopIndex(mountainArr);
        }

        System.out.println(TOP_INDEX);

        int l = 0;
        int top = TOP_INDEX;
        int r = mountainArr.length() - 1;

        if (mountainArr.get(l) == target) {
            return l;
        }

        // 左边二分查找
        int res = findLeft(target, mountainArr, l, top);
        if (res != -1) {
            return res;
        }

        if (mountainArr.get(top) == target) {
            return top;
        }

        // 右边二分查找
        res = findRight(target, mountainArr, top, r);
        if (res != -1) {
            return res;
        }

        if (mountainArr.get(r) == target) {
            return r;
        }

        return -1;
    }

    private int findLeft(int target, MountainArray mountainArray, int l, int r) {
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            int x = mountainArray.get(mid);
            if (x < target) {
                l = mid;
            } else if (x > target) {
                r = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int findRight(int target, MountainArray mountainArray, int l, int r) {
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            int x = mountainArray.get(mid);
            if (x < target) {
                r = mid;
            } else if (x > target) {
                l = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private void findTopIndex(MountainArray mountainArr) {
        int len = mountainArr.length();


        int[] l = new int[]{0, mountainArr.get(0)};
        int[] r = new int[]{len - 1, mountainArr.get(len - 1)};

        int[] mid = {len / 2, mountainArr.get(len / 2)};

        while (l[0] + 1 < mid[0]) {
            int x = (l[0] + mid[0]) / 2;
            int[] t = {x, mountainArr.get(x)};

            if (mid[1] > l[1] && mid[1] > t[1]) {
                l = t;
            } else if (t[1] > mid[1] && t[1] > l[1]) {
                r = mid;
                mid = t;
            }
        }
        while (mid[0] + 1 < r[0]) {

            int x = (r[0] + mid[0]) / 2;
            int[] t = {x, mountainArr.get(x)};

            if (mid[1] > r[1] && mid[1] > t[1]) {
                r = t;
            } else if (t[1] > mid[1] && t[1] > l[1]) {
                l = mid;
                mid = t;
            }
        }

        TOP_INDEX = mid[0];
    }

}