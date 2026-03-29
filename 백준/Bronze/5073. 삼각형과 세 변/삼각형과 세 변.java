import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null && !line.equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                sb.append("Equilateral\n");
            } else {
                int max, sumOfOthers;
                if (a >= b && a >= c) {
                    max = a;
                    sumOfOthers = b + c;
                } else if (b >= a && b >= c) {
                    max = b;
                    sumOfOthers = a + c;
                } else {
                    max = c;
                    sumOfOthers = a + b;
                }

                if (max >= sumOfOthers) {
                    sb.append("Invalid\n");
                } else if (a == b || b == c || a == c) {
                    sb.append("Isosceles\n");
                } else {
                    sb.append("Scalene\n");
                }
            }
        }
        System.out.print(sb);
    }
}