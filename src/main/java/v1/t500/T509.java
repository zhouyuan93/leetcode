package v1.t500;

/**
 * @author yuan.zhou
 */
public class T509 {
    public int fib(int N) {
        if(N == 0){
            return 0;
        }
        int x = 0;
        int y = 1;
        int i = 1;
        for(;i<N;i++){
            int temp = x+y;
            x = y;
            y = temp;
        }
        return y;
    }
}
