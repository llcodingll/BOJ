import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            
            int totalMinutes = m1 + m2;
            int totalHours = h1 + h2 + (totalMinutes / 60);
            totalMinutes %= 60;
            totalHours %= 12;
            if (totalHours == 0) totalHours = 12;
            
            sb.append("#").append(t).append(" ").append(totalHours).append(" ").append(totalMinutes).append("\n");
        }
        
        System.out.print(sb);
    }
}