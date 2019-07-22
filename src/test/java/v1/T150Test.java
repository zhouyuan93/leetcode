package v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T150Test {
    T150 t = new T150();

    @Test
    public void test_evalRPN() {
        String[] s;
        int res;

        s = new String[]{"2", "1", "+", "3", "*"};
        res = t.evalRPN(s);
        assertEquals(res, 9);

        s = new String[]{"4", "13", "5", "/", "+"};
        res = t.evalRPN(s);
        assertEquals(res, 6);

        s = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        res = t.evalRPN(s);
        assertEquals(res, 22);
    }

}