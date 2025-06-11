import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] primes = {2, 3, 5, 7, 11};

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] exponents = new int[5];

            for (int i = 0; i < primes.length; i++) {
                while (N % primes[i] == 0) {
                    exponents[i]++;
                    N /= primes[i];
                }
            }

            sb.append("#").append(t).append(" ");
            for (int exp : exponents) {
                sb.append(exp).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
