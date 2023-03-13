package v1.t2300;

public class T2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int res = 0;

        int n = energy.length;

        for (int i = 0; i < n; i++) {
            if (initialEnergy <= energy[i]) {
                res += energy[i] - initialEnergy + 1;
                initialEnergy = 1;
            }else{
                initialEnergy -= energy[i];
            }

            if (initialExperience <= experience[i]) {
                int x = experience[i] - initialExperience + 1;
                res += x;
                initialExperience += x;
            }
            initialExperience += experience[i];
        }


        return res;

    }
}
