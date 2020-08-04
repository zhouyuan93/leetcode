package v1.t0;

/**
 * @author yuan.zhou
 */
public class T43 {
    public static void main(String[] args) {
    }
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        if ("1".equals(num1)) {
            return num2;
        }
        if ("1".equals(num2)) {
            return num1;
        }
        int len = num1.length() + num2.length();
        int[] res = new int[len / 4 + 1];

        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();

        //int的数据类型32位 有符号 , 可以有效表达 0 ~ 999,999,999 , 可以合并4位char减少计算时间
        int[] move = {1, 10, 100, 1000};
        //初始化num1Int
        int step = 0;
        int[] num1Int = new int[num1.length() / 4 + 1];
        for (int i = num1Char.length - 1, j = num1Int.length - 1; i >= 0; i--) {
            if (step == 4) {
                step = 0;
                j--;
            }
            int x = num1Char[i] - '0';
            num1Int[j] += move[step++] * x;
        }
        //初始化num2Int
        int[] num2Int = new int[num2.length() / 4 + 1];
        step = 0;
        for (int i = num2Char.length - 1, j = num2Int.length - 1; i >= 0; i--) {
            if (step == 4) {
                step = 0;
                j--;
            }
            int x = num2Char[i] - '0';
            num2Int[j] += move[step++] * x;
        }

        //对num1Int 和 num2Int 相乘
        int upper = 0;
        for (int i2 = num2Int.length - 1; i2 >= 0; i2--) {
            for (int i1 = num1Int.length - 1; i1 >= 0; i1--) {
                int x = num2Int[i2];
                int y = num1Int[i1];
                int iRes = res.length - 1 - (num1Int.length - 1 - i1) - (num2Int.length - 1 - i2);
                int z = x * y + upper + res[iRes];
                res[iRes] = z % 10000;
                upper = z / 10000;
                while (upper > 0) {
                    iRes -= 1;
                    int zz = res[iRes] + upper;
                    res[iRes] = zz % 10000;
                    upper = zz/10000;
                }
            }

        }

        //将res导出成string
        StringBuilder sb = new StringBuilder();
        boolean hasZero = true;
        boolean first = true;
        for (int r : res) {
            if(first){
                if(r>0){
                    sb.append(r);
                    first=false;
                }
                continue;
            }
            String rStr = String.valueOf(r);
            String[] s = {"","000","00","0",""};
            sb.append(s[rStr.length()]);
            sb.append(rStr);
        }

        return sb.toString();
    }
}
