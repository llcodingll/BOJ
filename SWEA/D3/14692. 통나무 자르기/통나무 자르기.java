import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            long N = Long.parseLong(br.readLine());
            String winner = (N % 2 == 0) ? "Alice" : "Bob";
            sb.append("#").append(i).append(" ").append(winner).append("\n");
        }

        System.out.print(sb);
    }
}