package v1.t400;

/**
 * @author yuan.zhou
 */
public class T405 {
    public static char[] INDEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {

        if(num == 0){
            return "0";
        }

        StringBuilder res = new StringBuilder();

        while (num != 0) {
            res.append(INDEX[num&(16-1)]);
            num >>>= 4;
        }

        return res.reverse().toString();
    }
}
