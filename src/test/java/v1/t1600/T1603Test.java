package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1603Test {

    T1603 t;

    @BeforeEach
    void setUp() {
        t = new T1603();
    }

    @Test
    void test_1() {
        T1603.ParkingSystem park = new T1603.ParkingSystem(1, 1, 0);
        assertEquals(true,park.addCar(1));
        assertEquals(true,park.addCar(2));
        assertEquals(false,park.addCar(3));
        assertEquals(false,park.addCar(1));
    }
}