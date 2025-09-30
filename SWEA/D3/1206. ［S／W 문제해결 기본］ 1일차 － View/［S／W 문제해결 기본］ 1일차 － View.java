import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] buildings = new int[N];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                buildings[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 2; i < N - 2; i++) {
                int leftMax = Math.max(buildings[i-1], buildings[i-2]);
                int rightMax = Math.max(buildings[i+1], buildings[i+2]);
                int maxNeighbor = Math.max(leftMax, rightMax);

                if (buildings[i] > maxNeighbor) {
                    count += buildings[i] - maxNeighbor;
                }
            }

            sb.append("#").append(tc).append(" ").append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}
