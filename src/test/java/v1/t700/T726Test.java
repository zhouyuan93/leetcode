package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T726Test {

    T726 t;

    @BeforeEach
    void setUp() {
        t = new T726();
    }

    @Test
    void test_1() {
        String formula = "H2O";
        String a = t.countOfAtoms(formula);
        String e = "H2O";
        assertEquals(e, a);
    }


    @Test
    void test_2() {
        String formula = "Mg(OH)2";
        String a = t.countOfAtoms(formula);
        String e = "H2MgO2";
        assertEquals(e, a);
    }


    @Test
    void test_3() {
        String formula = "K4(ON(SO3)2)2";
        String a = t.countOfAtoms(formula);
        String e = "K4N2O14S4";
        assertEquals(e, a);
    }

    @Test
    void test_4() {
        String formula = "Mg((H2O)2Na)4(F)(H2SO4)N";
        String a = t.countOfAtoms(formula);
        String e = "FH18MgNNa4O12S";
        assertEquals(e, a);
    }
}