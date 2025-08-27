import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] solved = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int count = 0;
                for (int j = 0; j < M; j++) {
                    count += Integer.parseInt(st.nextToken());
                }
                solved[i] = count;
            }

            int maxSolved = 0;
            for (int i = 0; i < N; i++) {
                if (solved[i] > maxSolved) {
                    maxSolved = solved[i];
                }
            }

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (solved[i] == maxSolved) {
                    cnt++;
                }
            }

            sb.append("#").append(t).append(" ").append(cnt).append(" ").append(maxSolved).append("\n");
        }

        System.out.print(sb.toString());
    }
}
