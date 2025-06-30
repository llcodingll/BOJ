import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            String path = br.readLine();
            long a = 1, b = 1;

            for (char c : path.toCharArray()) {
                if (c == 'L') {
                    b = a + b;
                } else if (c == 'R') {
                    a = a + b;
                }
            }

            sb.append("#").append(t).append(" ").append(a).append(" ").append(b).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}