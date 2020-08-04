package v1.t200;

public class T278 {
    private int maxVersion;
    private int errorVersion;

    public T278(int maxVersion, int errorVersion) {
        this.maxVersion = maxVersion;
        this.errorVersion = errorVersion;
    }

    public int firstBadVersion(int n) {
        int minP = 0;
        int maxP = n;

        int mid = (1+n)/2;

        while(maxP - minP > 1){
            if(isBadVersion(mid)){
                maxP = mid;
            }else{
                minP = mid;
            }
            mid = minP + (maxP - minP)/2;
        }

        return maxP;
    }

    private boolean isBadVersion(int version) {
        return this.errorVersion <= version;
    }
}
