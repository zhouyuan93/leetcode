package v1.t800;

/**
 * @author yuan.zhou
 */
public class T837 {

    public double new21Game(int N, int K, int W){
        if (K == 0) {
            return 1.0;
        }
        int one = N-K+1;

        double[] memory = new double[K + W];
        double sum = one;

        for (int i = W - one; i < W ; i++) {
            memory[i] = 1;
        }

        for (int j = 0 ,i = W; i < memory.length; i++,j++) {
            double rate = sum / W;
            memory[i] = rate;
            sum = sum + rate - memory[j];
        }

        //System.out.println(Arrays.toString(memory));

        return memory[memory.length-1];


    }

    //如下超出时间限制
//    public double new21Game(int N, int K, int W){
//        double[] memory = new double[K+1];
//        double rate= new21Game(N, K, W, memory);
//        System.out.println(Arrays.toString(memory));
//        return rate;
//    }
//
//    public double new21Game(int N, int K, int W, double[] memory) {
//        if (K <= 0) {
//            return N >= 0 ? 1 : 0;
//        }
//        if (N < 0){
//            return 0;
//        }
//        if (memory[K] != 0) {
//            return memory[K];
//        }
//        double countRate = 0;
//        for (int i = 1; i <= W; i++) {
//            double rate = new21Game(N - i, K - i, W,memory);
//            countRate += rate;
//        }
//        if (K >= 0) {
//            System.out.println((N) + " " + (K) + " " + countRate / W);
//
//            memory[K] = countRate / W;
//        }
//        return countRate / W;
//    }


}
