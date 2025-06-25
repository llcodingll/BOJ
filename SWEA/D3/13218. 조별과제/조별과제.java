import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int maxGroups = N / 3;
            sb.append("#").append(t).append(" ").append(maxGroups).append("\n");
        }
        
        System.out.print(sb);
    }
}