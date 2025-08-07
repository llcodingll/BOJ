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
            int D = Integer.parseInt(st.nextToken());
            
            int coverage = 2 * D + 1;
            int sprinklers = (N + coverage - 1) / coverage;
            
            sb.append("#").append(t).append(" ").append(sprinklers).append("\n");
        }
        
        System.out.print(sb);
    }
}
