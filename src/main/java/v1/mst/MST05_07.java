package v1.mst;

public class MST05_07 {

    public static int TEMP = 1431655765;
    public int exchangeBits(int num) {
        return ((num >> 1) & TEMP ) + ((num & TEMP) << 1);
    }
}
