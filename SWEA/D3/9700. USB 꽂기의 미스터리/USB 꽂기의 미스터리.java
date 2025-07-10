import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double p = Double.parseDouble(st.nextToken());
            double q = Double.parseDouble(st.nextToken());

            double s1 = (1 - p) * q;
            double s2 = p * (1 - q) * q;

            sb.append("#").append(t).append(" ").append(s1 < s2 ? "YES" : "NO").append("\n");
        }

        System.out.print(sb.toString());
    }
}
