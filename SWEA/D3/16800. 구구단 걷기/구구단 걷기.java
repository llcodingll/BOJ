import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            long N = Long.parseLong(br.readLine());
            long minMoves = Long.MAX_VALUE;
            
            for (long i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    long a = i;
                    long b = N / i;
                    long moves = a + b - 2;
                    if (moves < minMoves) {
                        minMoves = moves;
                    }
                }
            }
            
            sb.append("#").append(t).append(" ").append(minMoves).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
