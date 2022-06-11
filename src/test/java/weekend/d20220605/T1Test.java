package weekend.d20220605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void name() {
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(t.minMaxGame(nums));
    }

    @Test
    void name2() {
        int[] nums = {93,40};
        System.out.println(t.minMaxGame(nums));
    }

    @Test
    void name3() {
        int[] nums = {5,2,3,4};
        System.out.println(t.minMaxGame(nums));
    }
}