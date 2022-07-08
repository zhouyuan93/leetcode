package v1.t2000;

public class T2038 {
    public boolean winnerOfGame(String colors) {
        if (colors.length() < 3) {
            return false;
        }

        char[] chars = colors.toCharArray();
        int x = 0;
        int y = 1;
        int z = 2;

        int a = 0;
        int b = 0;

        while (z < chars.length) {
            if (chars[x] == chars[y] && chars[y] == chars[z]) {
                if (chars[x] == 'A') {
                    while (z < chars.length && chars[z] == chars[x]) {
                        a++;
                        z++;
                    }
                } else {
                    while (z < chars.length && chars[z] == chars[x]) {
                        b++;
                        z++;
                    }
                }
                x = z;
                y = z + 1;
                z = z + 2;
            } else {
                x = y;
                y = z;
                z = z + 1;
            }
        }

        return a > b;
    }
}
