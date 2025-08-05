import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());

            int count = 0;
            while (x <= N && y <= N) {
                if (x < y) x += y;
                else y += x;
                count++;
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
