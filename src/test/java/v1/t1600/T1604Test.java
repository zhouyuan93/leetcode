package v1.t1600;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1604Test {

    T1604 t = new T1604();

    @Test
    void test_1() {

        String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = {"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};
        List<String> actual = t.alertNames(keyName, keyTime);
        List<String> expected = Arrays.asList("daniel");
        assertEquals(expected,actual);
    }
}