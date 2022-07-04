package v1.t900;

public class T911 {
    static class TopVotedCandidate {
        int[] persons;
        int[] times;

        public TopVotedCandidate(int[] persons, int[] times) {
            int[] voted = new int[persons.length];

            int p = -1;
            int t = -1;
            for (int i = 0; i < times.length; i++) {
                voted[persons[i]]++;
                if (p == -1 || p <= voted[persons[i]]) {
                    p = voted[persons[i]];
                    t = persons[i];
                }else{
                    persons[i] = t;
                }
            }

            this.persons = persons;
            this.times = times;
        }

        public int q(int t) {
            int l = 0;
            int r = times.length;

            if (t > times[times.length-1]) {
                return persons[persons.length - 1];
            }

            while (l < r) {
                int mid = (l + r) / 2;
                if (times[mid] > t) {
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }

            return persons[l-1];

        }
    }
}
