import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String[] parts = br.readLine().split(" ");
            int N = Integer.parseInt(parts[0]);
            int M = Integer.parseInt(parts[1]);

            int mask = (1 << N) - 1;

            if ((M & mask) == mask) {
                sb.append("#").append(t).append(" ON\n");
            } else {
                sb.append("#").append(t).append(" OFF\n");
            }
        }

        System.out.print(sb);
    }
}