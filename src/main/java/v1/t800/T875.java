package v1.t800;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class T875{
    class Worker{
        int quality;
        int wage;
        double average;

        public Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
            this.average = wage / (double) quality;
        }

        public int getQuality() {
            return quality;
        }

        public int getWage() {
            return wage;
        }

        public double getAverage() {
            return average;
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;

        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }

        Arrays.sort(workers, Comparator.comparing(Worker::getAverage).thenComparing(Worker::getQuality));

        int sumQuality = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            Worker w = workers[i];
            sumQuality += w.getQuality();
            queue.add(w.quality);
        }

        double res = sumQuality * workers[k - 1].getAverage();

        for (int i = k; i < n; i++) {
            Worker w = workers[i];
            if (w.getQuality() < queue.peek()) {
                sumQuality -= queue.poll();
                sumQuality += w.getQuality();
                queue.add(w.quality);
                double t = sumQuality * w.getAverage();
                if (t < res) {
                    res = t;
                }
            }
        }

        return res;

    }
}
