package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T39;

import java.util.List;

class T39Test {

    private T39 t;

    @BeforeEach
    void setUp() {
        this.t = new T39();
    }

    @Test
    void test1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        int[][] except = {
                {7},
                {2, 2, 3}
        };

        List<List<Integer>> actual = t.combinationSum(candidates, target);



    }

}