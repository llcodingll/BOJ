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
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int score = Integer.parseInt(st.nextToken());
                if (score < 40) score = 40;
                sum += score;
            }
            int avg = sum / 5;
            sb.append("#").append(t).append(" ").append(avg).append("\n");
        }

        System.out.print(sb.toString());
    }
}
