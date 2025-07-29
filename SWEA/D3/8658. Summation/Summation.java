import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                int sum = digitSum(num);
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }

            sb.append("#").append(t).append(" ").append(max).append(" ").append(min).append("\n");
        }

        System.out.print(sb.toString());
    }
}
