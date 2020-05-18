package v1;

/**
 * @author yuan.zhou
 */
public class T42 {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int res = 0;

        int min = 0;
        int temp = height[min];
        for (int i = min + 1; i < height.length; i++) {
            if (height[i] > height[min]) {
                res += (height[min] * (i - min));
                res -= temp;
                min = i;
                temp = 0;
            }
            temp +=height[i];
        }

        int max = min;
        min = height.length-1;
        temp = height[min];
        for (int i = min - 1; i >= max; i--) {
            if (height[i] >= height[min]) {
                res += (height[min] * (min -i ));
                res -= temp;
                min = i;
                temp = 0;
            }
            temp +=height[i];
        }
        return res;

    }
}
