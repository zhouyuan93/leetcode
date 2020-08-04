package v1.t100;

/**
 * @author yuan.zhou
 */
public class T167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int lastRight = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                lastRight = right--;
            } else if (numbers[left] + numbers[right] < target) {
                right = lastRight;
                left++;
            } else {
                break;
            }
        }

        return new int[]{left + 1, right + 1};
    }
}
