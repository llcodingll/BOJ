import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            long totalDamage;
            if (L == 0) {
                totalDamage = (long) D * N;
            } else {
                totalDamage = (long) D * N + (long) D * L * (N - 1) * N / 200;
            }

            sb.append("#").append(t).append(" ").append(totalDamage).append("\n");
        }

        System.out.print(sb);
    }
}