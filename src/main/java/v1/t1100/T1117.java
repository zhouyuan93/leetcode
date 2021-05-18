package v1.t1100;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class T1117 {
    class H2O {

        Semaphore h = new Semaphore(2);
        Semaphore o = new Semaphore(0);

        AtomicInteger count = new AtomicInteger(0);

        public H2O() {
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            h.acquire();

            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();

            if (count.addAndGet(1) == 2) {
                o.release(1);
            }
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            o.acquire();

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();

            count.set(0);
            h.release(2);
        }
    }
}
