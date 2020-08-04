package v1.t0;

public class T34 {

    public int[] searchRange(int[] nums, int target) {
        int minP = 0;
        int maxP = nums.length - 1;
        int[] notFoundRes = new int[]{-1, -1};

        //特殊情况 1-数组长度为0
        if (nums.length == 0) {
            return notFoundRes;
        }
        //特殊情况 2-target不在目标数组范围内
        if (nums[0] > target || nums[maxP] < target) {
            return notFoundRes;
        }

        //临时指针
        int temp = (minP + maxP) / 2;

        //规则
        //target可能在范围内！
        //minP maxP 只指向临界数值
        while ((nums[minP] != target || nums[maxP] != target) && maxP - minP > 1) {
            if (nums[temp] > target) {
                maxP = temp;
                temp = (minP + maxP) / 2;
            } else if (nums[temp] < target) {
                minP = temp;
                temp = (minP + maxP) / 2;
            } else {
                //nums[temp] == target 临界，非临界
                if (nums[maxP] != target) {
                    //循环始终保证nums[temp] == target
                    int tempX = temp;
                    while (maxP - tempX > 1) {
                        int q = (tempX + maxP) / 2;
                        if (nums[q] != target) {
                            maxP = q;
                        } else {
                            tempX = q;
                        }
                    }
                    maxP = nums[maxP] == target ? maxP : tempX;
                }
                if (nums[minP] != target) {
                    //循环始终保证nums[temp] == target
                    int tempX = temp;
                    while (tempX - minP > 1) {
                        int q = (tempX + minP) / 2;
                        if (nums[q] != target) {
                            minP = q;
                        } else {
                            tempX = q;
                        }
                    }
                    minP = nums[minP] == target ? minP : tempX;
                }
            }

        }

        minP = nums[minP] == target ? minP : maxP;
        maxP = nums[maxP] == target ? maxP : minP;

        int[] res = new int[]{minP, maxP};
        return nums[minP] == target ? res : notFoundRes;
    }
}

