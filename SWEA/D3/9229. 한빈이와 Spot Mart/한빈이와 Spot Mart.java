import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] snacks = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                snacks[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(snacks);

            int max = -1;
            int left = 0;
            int right = N - 1;

            while (left < right) {
                int sum = snacks[left] + snacks[right];
                if (sum > M) {
                    right--;
                } else {
                    max = Math.max(max, sum);
                    left++;
                }
            }

            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}