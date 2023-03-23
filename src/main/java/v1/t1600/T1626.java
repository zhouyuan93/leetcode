package v1.t1600;


import java.util.Arrays;

public class T1626 {
    private class Node {
        int score;
        int age;
        int sum;

        public Node(int score, int age) {
            this.score = score;
            this.age = age;
        }
    }

    public int bestTeamScore(int[] scores, int[] ages) {
        int result = 0;
        int len = scores.length;

        Node[] nodes = new Node[scores.length];

        for (int i = 0; i < len; i++) {
            nodes[i] = new Node(scores[i], ages[i]);
        }

        Arrays.sort(nodes, (a, b) -> (a.score - b.score) * 1000 + a.age-b.age);

        for (int i = 0; i < nodes.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nodes[j].age <= nodes[i].age) {
                    max = Math.max(nodes[j].sum, max);
                }
            }
            nodes[i].sum = nodes[i].score + max;
            result = Math.max(nodes[i].sum, result);
        }


        return result;
    }
}
