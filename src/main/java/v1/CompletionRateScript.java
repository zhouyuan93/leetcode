package v1;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CompletionRateScript {

    private static class Rate {
        int idx;
        String fileName;
        int accepted;

        List<Integer> completed;
        List<Integer> notCompleted;

        BigDecimal completedRate;

        public Rate(int idx, String fileName, int accepted, List<Integer> completed, List<Integer> notCompleted,
                    BigDecimal completedRate) {
            this.idx = idx;
            this.fileName = fileName;
            this.accepted = accepted;
            this.completed = completed;
            this.notCompleted = notCompleted;
            this.completedRate = completedRate;
        }
    }

    public static void main(String[] args) {
        File currentDir = new File("./src/main/java/v1");
        File[] files = currentDir.listFiles();
        List<Rate> list = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                String name = file.getName();
                if (name.charAt(0) != 't') {
                    continue;
                }
                int idx = Integer.parseInt(name.substring(1));
                File[] child = file.listFiles();
                int count = (int) Arrays.stream(child).map(File::getName)
                        .map(s -> s.substring(1, s.length() - 5))
                        .map(s -> Integer.parseInt(s))
                        .filter(i -> idx <= i && i < idx + 100)
                        .count();

                List<Integer> completed = Arrays.stream(child).map(File::getName)
                        .map(s -> s.substring(1, s.length() - 5))
                        .map(s -> Integer.parseInt(s))
                        .filter(i -> idx <= i && i < idx + 100)
                        .collect(Collectors.toList());

                Set<Integer> set = completed.stream().collect(Collectors.toSet());

                List<Integer> notCompleted = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    int t = i + idx;
                    if (!set.contains(t)) {
                        notCompleted.add(t);
                    }
                }

                BigDecimal rate = BigDecimal.valueOf(count).divide(BigDecimal.valueOf(100));
                Rate r = new Rate(idx, name, count, completed, notCompleted, rate);
                list.add(r);

            }
        }

        list = list.stream().sorted(Comparator.comparingLong(l -> l.idx)).collect(Collectors.toList());

        list.forEach(
                l -> {
                    String s = "[%5s]: %3d%% [%s]";
                    System.out.println(String.format(s, l.fileName,
                            l.accepted,
                            getProgressBar(l.accepted)));
                }
        );
        System.out.println(" ");
        list.forEach(
                l -> {
                    String s = "[%5s]: %s";
                    System.out.println(String.format(s, l.fileName, l.notCompleted.toString()));
                }
        );
    }

    private static String getProgressBar(int d) {
        int barWidth = 20;
        int t = 100 / barWidth;
        d += t - 1;
        d /= t;
        char[] chars = new char[barWidth];
        Arrays.fill(chars, '.');
        Arrays.fill(chars, 0, d, '=');
        chars[d-1] = '>';

        return new String(chars);
    }
}
