import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            Integer[] A = new Integer[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(A, Collections.reverseOrder());
            
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    result += A[i] * 2 + 1;
                } else {
                    result += A[i] + 1;
                }
            }
            
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        
        System.out.print(sb);
    }
}
