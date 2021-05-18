package v1.t1600;

public class T1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] nums = new int[101];
        for (int i = 0; i < pieces.length; i++) {
            nums[pieces[i][0]] = i + 1;
        }

        int x = -1;
        int y = -1;
        for (int num : arr) {
            if (x == -1) {
                if (nums[num] == 0) {
                    return false;
                } else {
                    x = nums[num] - 1;
                    y = 1;
                    if (y >= pieces[x].length) {
                        x = -1;
                    }
                }
            } else {
                if (num != pieces[x][y]) {
                    return false;
                }
                y++;
                if (y >= pieces[x].length) {
                    x = -1;
                }
            }
        }

        return true;
    }
}
