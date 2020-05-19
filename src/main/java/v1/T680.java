package v1;

/**
 * @author yuan.zhou
 */
public class T680 {
    public boolean validPalindrome(String s) {
        char[] sChar = s.toCharArray();

        int left = 0;
        int right = sChar.length - 1;

        //假回溯保存回溯位置
        int rollBackLeft = -1;
        int rollBackRight = -1;

        boolean oneRemove = true;
        while (left < right) {
            //相等检查下一个
            if (sChar[left] == sChar[right]) {
                left++;
                right--;
                continue;
            }

            //不相等但可以移除一个 sChar[left] != sChar[right]
            if (oneRemove) {
                //右边保存到回溯里
                rollBackLeft = left;
                rollBackRight = right - 1;

                //左边跳过一个 右边不动 继续检查
                left++;

                //标记置为已经回溯
                oneRemove = false;
                continue;
            }

            //不相等 不可以移除 但可以回溯
            if (rollBackLeft != -1 && rollBackRight != -1) {
                left = rollBackLeft;
                right = rollBackRight;
                rollBackLeft = -1;
                rollBackRight = -1;
                continue;
            }

            //不相等 不可以移除 不可以回溯 返回失败
            return false;

        }

        return true;

    }

}
