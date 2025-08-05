import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }

            sum = sum - max - min;
            int avg = (int)Math.round(sum / 8.0);

            sb.append("#").append(t).append(" ").append(avg).append("\n");
        }

        System.out.print(sb);
    }
}
