import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result;
            if (A <= 9 && B <= 9) {
                result = A * B;
            } else {
                result = -1;
            }

            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}
