package v1.t1800;

public class T1812 {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';
        return ((x & 1) == 1 && (y & 1) == 0) || ((y & 1) == 1 && (x & 1) == 0);
    }
}
