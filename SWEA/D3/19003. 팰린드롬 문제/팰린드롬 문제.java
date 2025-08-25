import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            List<String> words = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                words.add(br.readLine());
            }
            
            boolean[] used = new boolean[N];
            int pairCount = 0;
            boolean hasCenter = false;
            
            for (int i = 0; i < N; i++) {
                if (used[i]) continue;
                String s = words.get(i);
                String rev = new StringBuilder(s).reverse().toString();
                if (s.equals(rev)) {
                    hasCenter = true;
                    continue;
                }
                for (int j = i+1; j < N; j++) {
                    if (!used[j] && words.get(j).equals(rev)) {
                        pairCount++;
                        used[i] = true;
                        used[j] = true;
                        break;
                    }
                }
            }
            
            int answer = pairCount * 2 * M + (hasCenter ? M : 0);
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}