import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            String num = br.readLine().trim();
            char lastDigit = num.charAt(num.length() - 1);

            if ((lastDigit - '0') % 2 == 0) {
                sb.append("#").append(tc).append(" Even\n");
            } else {
                sb.append("#").append(tc).append(" Odd\n");
            }
        }

        System.out.print(sb.toString());
    }
}