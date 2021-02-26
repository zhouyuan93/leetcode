package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T792Test {

    T792 t;

    @BeforeEach
    void setUp() {
        t = new T792();
    }

    @Test
    void test_1() {
        String S = "abcde";
        String[] words = {"a", "acd", "ace", "bb"};
        int actual = t.numMatchingSubseq(S, words);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String S = "dsahjpjauf";
        String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
        int actual = t.numMatchingSubseq(S, words);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String S = "dcoegauiqk";
        String[] words = {"dco","coegauiq","ehqyopnqgm","wtqbgozlae"};
        int actual = t.numMatchingSubseq(S, words);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String S = "aa";
        String[] words = {"aab","baa","ada","aa"};
        int actual = t.numMatchingSubseq(S, words);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String S = "ricogwqznwxxcpueelcobbbkuvxxrvgyehsudccpsnuxpcqobtvwkuvsubiidjtccoqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjscnlhbrhookmioxqighkxfugpeekgtdofwzemelpyjsdeeppapjoliqlhbrbghqjezzaxuwyrbczodtrhsvnaxhcjiyiphbglyolnswlvtlbmkrsurrcsgdzutwgjofowhryrubnxkahocqjzwwagqidjhwbunvlchojtbvnzdzqpvrazfcxtvhkruvuturdicnucvndigovkzrqiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqnhrewhagldzhryzdmmrwnxhaqfezeeabuacyswollycgiowuuudrgzmwnxaezuqlsfvchjfloczlwbefksxsbanrektvibbwxnokzkhndmdhweyeycamjeplecewpnpbshhidnzwopdjuwbecarkgapyjfgmanuavzrxricbgagblomyseyvoeurekqjyljosvbneofjzxtaizjypbcxnbfeibrfjwyjqrisuybfxpvqywqjdlyznmojdhbeomyjqptltpugzceyzenflfnhrptuugyfsghluythksqhmxlmggtcbdddeoincygycdpehteiugqbptyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjckmaptilrbfpjxiarmwalhbdjiwbaknvcqovwcqiekzfskpbhgxpyomekqvzpqyirelpadooxjhsyxjkfqavbaoqqvvknqryhotjritrkvdveyapjfsfzenfpuazdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzqfgqwhgobwyhxltligahroyshfndydvffd";
        String[] words = {"awinuyoppufjxgqvcddleqdhbkmolxqyvsqprnwcoehpturicf"};
        int actual = t.numMatchingSubseq(S, words);
        int expected = 0;
        assertEquals(expected,actual);
    }
}