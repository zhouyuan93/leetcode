package v1.t1000;

public class T1093 {
    public double[] sampleStats(int[] count) {
        int l = 0;
        int r = count.length-1;

        while (count[l] == 0) {
            l++;
        }

        int min = l;

        while (count[r] == 0) {
            r--;
        }

        int max = r;

        double average = 0;
        int sumCount = 0;
        int z = 0;
        int zCount = 0;
        for (int i = l; i <= r; i++) {
            if (count[i] == 0) {
                continue;
            }
            if (count[i] > zCount) {
                z = i;
                zCount = count[i];
            }
            sumCount += (count[i]);
            average += count[i] * (i - average) / sumCount;
        }


        double mid = 0;
        int halfIdx = sumCount / 2 + 1;
        int before = 0;
        int x = 0;
        int i = l;
        for (; i <= r; i++) {
            if(count[i] == 0){
                continue;
            }
            x += count[i];
            if(x >= halfIdx){
                mid = i;
                break;
            }
            before = i;
        }
        if ((sumCount & 1) == 0) {
            halfIdx--;
            x -= count[i];
            if (x >= halfIdx) {
                mid += before;
                mid /= 2.0d;
            }
        }

        return new double[]{min, max, average, mid, z};



    }
}
