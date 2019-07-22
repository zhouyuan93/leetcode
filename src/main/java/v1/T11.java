package v1;

public class T11 {
    public static void main(String[] args) {
        T11 t = new T11();
        System.out.println(t.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length-1; j > i; j--) {
                int size = getSize(i, 0, j, Math.min(height[i], height[j]));
                res = res > size ? res : size;
                if (res > (j - i-1) * height[i]) {
                    break;
                }
            }
        }
        return res;
    }

    public int getSize(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }

}
