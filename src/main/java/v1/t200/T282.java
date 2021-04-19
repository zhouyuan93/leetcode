package v1.t200;

import java.util.LinkedList;
import java.util.List;

public class T282 {
    class Node {
        int func;
        int x;
        int beforeVal;

        public Node(int func, int x, int beforeVal) {
            this.func = func;
            this.x = x;
            this.beforeVal = beforeVal;
        }
    }

    public List<String> addOperators(String num, int target) {
        List<String> res = new LinkedList<>();

        int head = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            head = head * 10 + (num.charAt(i) - '0');
            if (head < 0) {
                continue;
            }

            List<Node> nodeList = new LinkedList<>();
            Node node = new Node(1, head, 0);
            nodeList.add(node);
            sb.append(num.charAt(i));
            addOperators(num, i + 1, target, res, nodeList, sb);

            if (head == 0) {
                break;
            }
        }
        return res;
    }

    public void addOperators(String num, int idx, int target, List<String> res, List<Node> nodeList,
                             StringBuilder sb) {
        // 取最后一个节点信息
        Node node = nodeList.get(0);
        int val = node.beforeVal + node.func * node.x;

        if (idx >= num.length()) {
            if (val == target) {
                res.add(sb.toString());
            }
            return;
        }

        int p = 0;
        // 按不同的长度生成p
        for (int i = idx; i < num.length(); i++) {
            p = p * 10 + (num.charAt(i)-'0');
            if (p < 0) {
                continue;
            }

            int len = sb.length();

            //加减
            sb.append('+');
            sb.append(p);
            nodeList.add(0,new Node(1, p, val));
            addOperators(num, i + 1, target, res, nodeList, sb);
            nodeList.remove(0);
            sb.delete(len, sb.length());

            sb.append('-');
            sb.append(p);
            nodeList.add(0,new Node(-1,p,val));
            addOperators(num, i + 1, target, res, nodeList, sb);
            nodeList.remove(0);
            sb.delete(len, sb.length());

            //乘
            sb.append('*');
            sb.append(p);
            int tempX = node.x;
            node.x *= p;
            addOperators(num, i + 1, target, res, nodeList, sb);
            node.x = tempX;
            sb.delete(len, sb.length());

            if (p == 0) {
                break;
            }
        }
    }

}
