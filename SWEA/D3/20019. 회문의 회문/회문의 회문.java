import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String S = br.readLine();
            int N = S.length();
            int mid = (N - 1) / 2;

            String first = S.substring(0, mid);
            String last = S.substring(mid + 1);

            boolean result = isPalindrome(S) && isPalindrome(first) && isPalindrome(last);

            System.out.println("#" + t + " " + (result ? "YES" : "NO"));
        }
    }
}
