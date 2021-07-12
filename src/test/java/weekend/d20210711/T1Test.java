package weekend.d20210711;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void name() {

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(t.getConcatenation(nums)));

    }
}