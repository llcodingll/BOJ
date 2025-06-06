import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                String[] parts = br.readLine().split(" ");
                char ch = parts[0].charAt(0);
                int count = Integer.parseInt(parts[1]);

                for (int j = 0; j < count; j++) {
                    sb.append(ch);
                }
            }

            System.out.println("#" + t);
            String result = sb.toString();
            for (int i = 0; i < result.length(); i++) {
                System.out.print(result.charAt(i));
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            if (result.length() % 10 != 0) {
                System.out.println();
            }
        }
    }
}
