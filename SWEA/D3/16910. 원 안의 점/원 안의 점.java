import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for (int x = -N; x <= N; x++) {
                for (int y = -N; y <= N; y++) {
                    if (x * x + y * y <= N * N) {
                        count++;
                    }
                }
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}