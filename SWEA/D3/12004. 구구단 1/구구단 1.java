import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine());
            boolean canBeExpressed = false;

            for (int i = 1; i <= 9; i++) {
                if (N % i == 0) {
                    int b = N / i;
                    if (b >= 1 && b <= 9) {
                        canBeExpressed = true;
                        break;
                    }
                }
            }

            sb.append("#").append(t).append(" ").append(canBeExpressed ? "Yes" : "No").append("\n");
        }
        System.out.print(sb.toString());
    }
}
