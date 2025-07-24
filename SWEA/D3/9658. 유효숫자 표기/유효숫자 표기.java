import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            String N = br.readLine().trim();
            int exp = N.length() - 1;

            StringBuilder sig = new StringBuilder(N.substring(0, Math.min(3, N.length())));
            while (sig.length() < 3) sig.append("0");

            BigDecimal bd = new BigDecimal(sig.toString().charAt(0) + "." + sig.substring(1));
            bd = bd.setScale(1, BigDecimal.ROUND_HALF_UP);

            if (bd.compareTo(new BigDecimal("10.0")) == 0) {
                bd = new BigDecimal("1.0");
                exp += 1;
            }

            sb.append("#").append(t).append(" ").append(bd.toString()).append("*10^").append(exp).append("\n");
        }

        System.out.print(sb);
    }
}
