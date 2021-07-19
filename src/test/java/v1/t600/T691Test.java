package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T691Test {

    T691 t;

    @BeforeEach
    void setUp() {
        t = new T691();
    }

    @Test
    void test_1() {
        String[] s = {"with", "example", "science"};
        String target = "thehat";
        int a = t.minStickers(s, target);
        int e = 3;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        String[] s = {"these","guess","about","garden","him"};
        String target = "atomher";
        int a = t.minStickers(s, target);
        int e = 3;
        assertEquals(e,a);
    }

    @Test
    void test_3() {
        String[] s = {"indicate","why","finger","star","unit","board","sister","danger","deal","bit","phrase","caught","if","other","water","huge","general","read","gold","shall","master","men","lay","party","grow","view","if","pull","together","head","thank","street","natural","pull","raise","cost","spoke","race","new","race","liquid","me","please","clear","could","reply","often","huge","old","nor"};
        String target = "fhhfiyfdcwbycma";
        int a = t.minStickers(s, target);
        int e = 3;
        assertEquals(e,a);
    }
}