package v1.t1400;

import java.util.HashSet;

public class T1496 {
    public boolean isPathCrossing(String path) {
        int location = 0;

        HashSet<Integer> set = new HashSet<>(path.length() *2);
        set.add(0);

        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    location += 100000;
                    break;
                case 'S':
                    location -= 100000;
                    break;
                case 'E':
                    location += 1;
                    break;
                default:
                    location -= 1;
            }

            if (!set.add(location)) {
                return true;
            }
        }

        return false;

    }
}
