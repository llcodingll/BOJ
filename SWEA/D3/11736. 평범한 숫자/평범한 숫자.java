import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 1; i < N - 1; i++) {
                int a = arr[i - 1];
                int b = arr[i];
                int c = arr[i + 1];
                if ((b > a && b < c) || (b < a && b > c)) {
                    count++;
                }
            }
            sb.append("#").append(t).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }
}
