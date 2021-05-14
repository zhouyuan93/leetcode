package v1.mst;

public class MST10_11 {
    public void wiggleSort(int[] nums) {
        // 构建下标数据
        int[] ids = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length/2; i++) {
            ids[i] = p;
            p+=2;
        }
        p = 0;
        for (int i = nums.length/2; i < nums.length; i++) {
            ids[i] = p;
            p+=2;
        }

        // 进行快排序
        quickSort(nums, ids, 0, nums.length - 1);

    }

    void quickSort(int[] nums, int[] ids, int left, int right){
        if (left > right) {
            return;
        }

        int x = nums[ids[left]];

        int l = left + 1;
        int r = right;
        while (l < r) {
            if (nums[ids[l]] <= x) {
                nums[ids[l-1]] = nums[ids[l]];
                l++;
            }else{
                int t = nums[ids[r]];
                nums[ids[r]] = nums[ids[l]];
                nums[ids[l]] = t;
                r--;
            }
        }
        if(l < nums.length && nums[ids[l]] < x){
            nums[ids[l - 1]] = nums[ids[l]];
            l++;
        }
        nums[ids[l-1]] = x;

        quickSort(nums, ids, left, l - 2);
        quickSort(nums, ids, l, right);

    }

}
