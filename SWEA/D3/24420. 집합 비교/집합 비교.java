import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aSize = Integer.parseInt(st.nextToken());
            int bSize = Integer.parseInt(st.nextToken());

            Set<Integer> A = new HashSet<>();
            Set<Integer> B = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < aSize; i++) A.add(Integer.parseInt(st.nextToken()));

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < bSize; i++) B.add(Integer.parseInt(st.nextToken()));

            if (A.equals(B)) {
                sb.append("=\n");
            } else if (B.containsAll(A)) {
                sb.append("<\n");
            } else if (A.containsAll(B)) {
                sb.append(">\n");
            } else {
                sb.append("?\n");
            }
        }

        System.out.print(sb);
    }
}
