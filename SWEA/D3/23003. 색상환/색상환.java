import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};
        Map<String, Integer> colorMap = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            colorMap.put(colors[i], i);
        }

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if (s1.equals(s2)) {
                sb.append("E\n");
                continue;
            }

            int idx1 = colorMap.get(s1);
            int idx2 = colorMap.get(s2);
            int diff = (idx1 - idx2 + 6) % 6;

            if (diff == 1 || diff == 5) {
                sb.append("A\n");
            } else if (diff == 3) {
                sb.append("C\n");
            } else {
                sb.append("X\n");
            }
        }

        System.out.print(sb);
    }
}
