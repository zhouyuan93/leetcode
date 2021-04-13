package v1.t400;

import java.util.HashMap;

public class T421 {
    class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();

        public TrieNode() {
        }
    }

    public int findMaximumXOR(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(num, max);
        }

        int len = Integer.toBinaryString(max).length();

        // int 转换成 String , 并保持头部0
        int n = nums.length;
        String[] strNums = new String[n];
        int bitmask = 1 << len;
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = Integer.toBinaryString(bitmask | nums[i]).substring(1);
        }

        // 构建字典树
        TrieNode root = new TrieNode();
        int res = 0;
        for (String strNum : strNums) {
            TrieNode node = root;
            TrieNode xorNode = root;
            int currXor = 0;

            // 将strNum写入字典树 并在当前字典树找寻最大的异或值
            for (Character c : strNum.toCharArray()) {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                }else{
                    TrieNode newNode = new TrieNode();
                    node.children.put(c, newNode);
                    node = newNode;
                }

                Character need = c == '1' ? '0' : '1';
                if (xorNode.children.containsKey(need)) {
                    currXor = (currXor << 1) | 1;
                    xorNode = xorNode.children.get(need);
                }else{
                    currXor = currXor << 1;
                    xorNode = xorNode.children.get(c);
                }

                res = Math.max(currXor, res);

            }

        }

        return res;

    }
}
