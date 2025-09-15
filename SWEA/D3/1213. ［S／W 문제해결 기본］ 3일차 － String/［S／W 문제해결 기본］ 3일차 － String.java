import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        for (int T = 0; T < 10; T++) {
            int t = Integer.parseInt(br.readLine());
            String pattern = br.readLine();
            String text = br.readLine();

            int count = 0;
            for (int i = 0; i <= text.length() - pattern.length(); i++) {
                if (text.startsWith(pattern, i)) {
                    count++;
                }
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}