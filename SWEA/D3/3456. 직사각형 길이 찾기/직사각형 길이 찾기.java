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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            int answer;
            if (a == b) {
                answer = c;
            } else if (a == c) {
                answer = b;
            } else if (b == c) {
                answer = a;
            } else {
                answer = a; 
            }
            
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
