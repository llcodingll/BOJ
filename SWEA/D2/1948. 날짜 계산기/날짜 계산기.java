import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int days = 0;
            if (m1 == m2) {
                days = d2 - d1 + 1;
            } else {
                days += daysInMonth[m1 - 1] - d1 + 1;

                for (int m = m1 + 1; m < m2; m++) {
                    days += daysInMonth[m - 1];
                }
                days += d2;
            }
            sb.append("#").append(t).append(" ").append(days).append("\n");
        }

        System.out.print(sb);
    }
}