import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int theta = Integer.parseInt(br.readLine());

            int hour = (int)(theta / 30);
            int minute = (int)((theta % 30) / 0.5);

            if (hour == 12) hour = 0;

            sb.append("#").append(t).append(" ")
              .append(hour).append(" ").append(minute).append("\n");
        }

        System.out.print(sb.toString());
    }
}
