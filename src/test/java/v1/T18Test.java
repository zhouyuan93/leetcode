package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class T18Test {
    private T18 t;

    @BeforeEach
    void setUp() {
        this.t = new T18();
    }

    @Test
    public void test_fourSum_2() {
        int[] nums = {1,-2,-5,-4,-3,3,3,5};
        int target = -11;

        List<List<Integer>> res = t.foursum(nums, target);

        String[] exceptList = {
                "[-5, -4, -3, 1]",
        };


        String[] actualList = resToStrings(res);

        System.out.println(Arrays.toString(actualList));

        assertEquals(exceptList.length, res.size());
        assertArrayEquals(exceptList, actualList);

    }

    @Test
    public void test_fourSum_1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> res = t.foursum(nums, target);

        String[] exceptList = {
                "[-2, -1, 1, 2]",
                "[-2, 0, 0, 2]",
                "[-1, 0, 0, 1]",
        };


        String[] actualList = resToStrings(res);

        System.out.println(Arrays.toString(actualList));

        assertEquals(exceptList.length, res.size());
        assertArrayEquals(exceptList, actualList);

    }
    @Test
    public void test_xSum_2() {
        int x = 2;
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int begin = 0;

        List<List<Integer>> res = t.xSum(x, nums, target, begin);

        String[] exceptList = {
                "[1, 4]","[2, 3]"
        };


        String[] actualList = resToStrings(res);

        System.out.println(Arrays.toString(actualList));

        assertEquals(exceptList.length, res.size());
        assertArrayEquals(exceptList, actualList);

    }
    @Test
    public void test_xSum_1() {
        int x = 1;
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int begin = 0;

        List<List<Integer>> res = t.xSum(x, nums, target, begin);

        String[] exceptList = {
                "[3]"
        };

        assertEquals(exceptList.length, res.size());

        String[] actualList = resToStrings(res);



        assertArrayEquals(exceptList, actualList);

    }

    /**
     * 数组转换工具类
     * @param res
     */
    private String[] resToStrings(List<List<Integer>> res) {
        String[] actualList = new String[res.size()];
        res.stream().map(list -> {
            list.sort(Comparator.naturalOrder());
            return list.toString();
        }).collect(Collectors.toList()).toArray(actualList);
        return actualList;
    }

}