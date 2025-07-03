import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = A; i <= B; i++) {
                int sqrt = (int) Math.sqrt(i);
                if (sqrt * sqrt == i && isPalindrome(i) && isPalindrome(sqrt)) {
                    count++;
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }
}