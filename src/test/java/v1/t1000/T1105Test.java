package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1105Test {

    T1105 t;

    @BeforeEach
    void setUp() {
        t = new T1105();
    }

    @Test
    void test_1() {
        int[][] books = {{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
        int shelf_width = 4;
        int actual = t.minHeightShelves(books, shelf_width);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] books = {{7,3},{8,7},{2,7},{2,5}};
        int shelf_width = 10;
        int actual = t.minHeightShelves(books, shelf_width);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[][] books = {{11,83},{170,4},{93,80},{155,163},{134,118},{75,14},{122,192},{123,154},{187,29},{160,64},{170,152},{113,179},{60,102},{28,187},{59,95},{187,97},{49,193},{67,126},{75,45},{130,160},{4,102},{116,171},{43,170},{96,188},{54,15},{167,183},{58,158},{59,55},{148,183},{89,95},{90,113},{51,49},{91,28},{172,103},{173,3},{131,78},{11,199},{77,200},{58,65},{77,30},{157,58},{18,194},{101,148},{22,197},{76,181},{21,176}};
        int shelf_width = 200;
        int actual = t.minHeightShelves(books, shelf_width);
        int expected = 3746;
        assertEquals(expected,actual);
    }
}