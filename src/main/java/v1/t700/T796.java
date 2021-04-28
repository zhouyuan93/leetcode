package v1.t700;

public class T796 {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        B += B;
        return B.indexOf(A) >= 0;
    }

}
