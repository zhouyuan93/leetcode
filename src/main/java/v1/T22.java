package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T22 {
    public static void main(String[] args) {
        T22 t = new T22();
        System.out.println(t.generateParenthesis(1));

    }

    public List<String> generateParenthesis(int n) {
        List<String>[][] memory = new List[n + 1][n + 1];
        return parenthesisPlus(n, n, memory);
    }

    public List<String> parenthesisPlus(int left, int right, List<String>[][] memory) {
        List<String> res;
        if (memory[left][right] == null) {
            res = new ArrayList<>();
            if (left == right && left == 1) {
                res.add("()");
            } else if (left == right && left > 1) {
                res.addAll(parenthesisPlus(left - 1, right, memory).stream().map(s -> "(" + s).collect(Collectors.toList()));
            } else if (left == 0 && right > 0) {
                res.add(Stream.iterate(")", s -> s).limit(right).collect(Collectors.joining()));
            } else if (right > left) {
                res.addAll(parenthesisPlus(left - 1, right, memory).stream().map(s -> "(" + s).collect(Collectors.toList()));
                res.addAll(parenthesisPlus(left, right - 1, memory).stream().map(s -> ")" + s).collect(Collectors.toList()));
            }
            memory[left][right] = res;
        } else {
            res = memory[left][right];
        }
        return res;
    }

}
