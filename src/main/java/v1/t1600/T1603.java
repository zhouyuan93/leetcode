package v1.t1600;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yuan.zhou
 */
public class T1603 {
    public static class ParkingSystem {

        private final int big;
        private final int medium;
        private final int small;

        private AtomicInteger bigCar;
        private AtomicInteger mediumCar;
        private AtomicInteger smallCar;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium ;
            this.small = small ;
            this.bigCar = new AtomicInteger(0);
            this.mediumCar = new AtomicInteger(0);
            this.smallCar = new AtomicInteger(0);
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1:
                    if (bigCar.get() >= big) {
                        return false;
                    }
                    bigCar.addAndGet(1);
                    break;
                case 2:
                    if (mediumCar.get() >= medium) {
                        return false;
                    }
                    mediumCar.addAndGet(1);
                    break;
                case 3:
                    if (smallCar.get() >= small) {
                        return false;
                    }
                    smallCar.addAndGet(1);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }
}
