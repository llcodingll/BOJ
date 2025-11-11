class Solution {
    public int solution(int[] players, int m, int k) {
        int active = 0, answer = 0;
        int[] endings = new int[24 + k];

        for (int t = 0; t < 24; t++) {
            active -= endings[t];

            int need = (players[t]) / m;

            if (active < need) {
                int add = need - active;
                answer += add;
                active += add;
                
                endings[t + k] += add;
            }
        }

        return answer;
    }
}