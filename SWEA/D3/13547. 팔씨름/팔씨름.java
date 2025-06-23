import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            String S = br.readLine();
            int winCount = 0;

            for (char c : S.toCharArray()) {
                if (c == 'o') winCount++;
            }

            int remaining = 15 - S.length();
            boolean possible = (winCount + remaining) >= 8;

            sb.append("#").append(t).append(" ").append(possible ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}
