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
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 != 0) {
                    sum += num;
                }
            }

            sb.append("#").append(t).append(" ").append(sum).append("\n");
        }

        System.out.print(sb.toString());
    }
}
