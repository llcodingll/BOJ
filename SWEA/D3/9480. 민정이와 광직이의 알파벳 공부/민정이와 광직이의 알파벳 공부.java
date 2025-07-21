import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] wordMasks = new int[N];
            
            for (int i = 0; i < N; i++) {
                String word = br.readLine();
                int mask = 0;
                for (char c : word.toCharArray()) {
                    mask |= 1 << (c - 'a');
                }
                wordMasks[i] = mask;
            }
            
            int total = 0;
            int FULL_MASK = (1 << 26) - 1;
            int limit = 1 << N;
            for (int subset = 1; subset < limit; subset++) {
                int combinedMask = 0;
                for (int i = 0; i < N; i++) {
                    if ((subset & (1 << i)) != 0) {
                        combinedMask |= wordMasks[i];
                    }
                }
                if (combinedMask == FULL_MASK) {
                    total++;
                }
            }
            
            sb.append("#").append(t).append(" ").append(total).append("\n");
        }
        
        System.out.print(sb);
    }
}
