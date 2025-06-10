import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            String encoded = br.readLine();

            byte[] decodedBytes = Base64.getDecoder().decode(encoded);
            String decoded = new String(decodedBytes, "UTF-8");

            sb.append("#").append(t).append(" ").append(decoded).append("\n");
        }

        System.out.print(sb.toString());
    }
}
