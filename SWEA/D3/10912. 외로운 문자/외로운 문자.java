import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String input = br.readLine();
            int[] count = new int[26];

            for (char ch : input.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] % 2 == 1) {
                    result.append((char)(i + 'a'));
                }
            }

            if (result.length() == 0) {
                System.out.println("#" + t + " Good");
            } else {
                System.out.println("#" + t + " " + result.toString());
            }
        }
    }
}