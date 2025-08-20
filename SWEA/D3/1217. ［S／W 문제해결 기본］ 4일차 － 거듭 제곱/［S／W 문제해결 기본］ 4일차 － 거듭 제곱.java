import java.util.Scanner;

public class Solution {
    public static int power(int n, int m) {
        if (m == 0) return 1;
        if (m == 1) return n;
        return n * power(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 10; t++) {
            int tc = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            int result = power(n, m);

            System.out.println("#" + tc + " " + result);
        }

        sc.close();
    }
}
