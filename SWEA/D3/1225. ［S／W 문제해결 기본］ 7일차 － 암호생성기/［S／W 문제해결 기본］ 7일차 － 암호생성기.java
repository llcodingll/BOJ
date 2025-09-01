import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int T = 0; T < 10; T++) {
            int t = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < 8; i++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }

            int minus = 1;
            while (true) {
                int num = q.poll() - minus;
                if (num <= 0) {
                    q.offer(0);
                    break;
                } else {
                    q.offer(num);
                }
                minus++;
                if (minus > 5) minus = 1;
            }

            sb.append("#").append(t).append(" ");
            for (int n : q) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
