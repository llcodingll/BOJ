import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String input = br.readLine();
            int count = 0;
            
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == alphabet.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }

            sb.append("#").append(t).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}
