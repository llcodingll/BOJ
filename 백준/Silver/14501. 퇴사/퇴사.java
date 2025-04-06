import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, profit;
    static int[][] consulting;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        consulting = new int[N+1][2];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                consulting[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        profit = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = re(i);
                if (sum > profit) {
                    profit = sum;
                }
            }
        }
        System.out.println(profit);
    }

    static int re(int i) {
        if(i > N) return 0;
        int period = consulting[i][0];
        int pay = consulting[i][1];

        if (i + period - 1 > N) return 0;

        int maxSum = 0;
        int nday = i + period;

        for (int j = nday; j <= N; j++) {
            maxSum = Math.max(maxSum, re(j));
        }

        return pay + maxSum;
    }
}