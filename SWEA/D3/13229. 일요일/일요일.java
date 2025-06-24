import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            String S = br.readLine().trim();
            int daysLeft = 0;

            for (int i = 0; i < days.length; i++) {
                if (days[i].equals(S)) {
                    daysLeft = (7 - ((i + 1) % 7));
                    if (daysLeft == 0) daysLeft = 7;
                    break;
                }
            }
            sb.append("#").append(t).append(" ").append(daysLeft).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
