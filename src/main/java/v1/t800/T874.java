package v1.t800;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T874 {
    public class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void runOneStep(int[] way) {
            x += way[0];
            y += way[1];
        }

        public void rollbackOneStep(int[] way) {
            x -= way[0];
            y -= way[1];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Location location = (Location) o;
            return x == location.x &&
                    y == location.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Location> obstacleSet = new HashSet<>((int) (obstacles.length % 0.75) + 1);
        if (obstacles != null && obstacles.length > 0) {
            for (int[] obstacle : obstacles) {
                obstacleSet.add(new Location(obstacle[0], obstacle[1]));
            }
        }

        //0-north 1-east 2-south 3-west
        int[][] ways = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;

        int res = 0;

        Location location = new Location(0, 0);
        for (int command : commands) {
            if (command == -1) {
                dir = dir == 3 ? 0 : dir + 1;
            } else if (command == -2) {
                dir = dir == 0 ? 3 : dir - 1;
            } else {
                for (int i = 0; i < command; i++) {
                    location.runOneStep(ways[dir]);
                    if (obstacleSet.contains(location)) {
                        location.rollbackOneStep(ways[dir]);
                        break;
                    }
                    res = Math.max(res, location.x * location.x + location.y * location.y);
                }
            }
        }

        return res;

    }

}
