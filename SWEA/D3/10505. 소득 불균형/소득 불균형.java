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
            int[] incomes = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int i = 0; i < N; i++) {
                incomes[i] = Integer.parseInt(st.nextToken());
                sum += incomes[i];
            }

            double avg = (double) sum / N;
            int count = 0;

            for (int income : incomes) {
                if (income <= avg) {
                    count++;
                }
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}
