class Solution {
    public int solution(int n) {
        int battery = 0;

        while (n > 0) {
            // 홀수면 점프 1번 필요
            if (n % 2 == 1) {
                battery++;
                n--;
            }
            // 짝수면 순간이동
            n /= 2;
        }

        return battery;
    }
}
