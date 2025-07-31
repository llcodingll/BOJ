import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int K = Integer.parseInt(br.readLine());
            int N = 1 << K;
            int[] skills = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                skills[i] = Integer.parseInt(st.nextToken());
            }

            long total = 0;

            List<Integer> current = new ArrayList<>();
            for (int skill : skills) current.add(skill);

            while (current.size() > 1) {
                List<Integer> next = new ArrayList<>();
                for (int i = 0; i < current.size(); i += 2) {
                    int a = current.get(i);
                    int b = current.get(i + 1);
                    total += Math.abs(a - b);
                    next.add(Math.max(a, b));
                }
                current = next;
            }

            sb.append("#").append(t).append(" ").append(total).append("\n");
        }

        System.out.print(sb);
    }
}
