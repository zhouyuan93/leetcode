package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T17 {
    public static void main(String[] args) {
        T17 t = new T17();
        System.out.println(t.letterCombinations("245123"));
    }
    public List<String> letterCombinations(String digits) {
        Stream<String> res = Stream.of("");
        if(digits == null || "".equals(digits)){
            return new ArrayList();
        }

        BiFunction<Stream<String>,List<String>,Stream<String>> combiner = (original,add) -> original.flatMap(s ->  add.stream().map(a -> s + a));

        for (char c:digits.toCharArray() ) {
            switch (c) {
                case '2': res = combiner.apply(res,Arrays.asList("a","b","c"));
                    break;
                case '3': res = combiner.apply(res,Arrays.asList("d","e","f"));
                    break;
                case '4': res = combiner.apply(res,Arrays.asList("g","h","i"));
                    break;
                case '5': res = combiner.apply(res,Arrays.asList("j","k","l"));
                    break;
                case '6': res = combiner.apply(res,Arrays.asList("m","n","o"));
                    break;
                case '7': res = combiner.apply(res,Arrays.asList("p","q","r","s"));
                    break;
                case '8': res = combiner.apply(res,Arrays.asList("t","u","v"));
                    break;
                case '9': res = combiner.apply(res,Arrays.asList("w","x","y","z"));
                    break;
                default:
            }
        }

        return res.collect(Collectors.toList());

    }



}
