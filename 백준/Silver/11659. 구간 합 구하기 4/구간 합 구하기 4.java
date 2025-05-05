import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] num = new int[N+1];
        num[0] = 0;

        int sum = 0;
        int[][] range = new int[M][2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st2.nextToken());
            sum+=n;
            num[i] = sum;
        }
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st3.nextToken());
            int q = Integer.parseInt(st3.nextToken());

            ans = num[q] - num[o - 1];
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
