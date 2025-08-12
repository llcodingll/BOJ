import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            String Nstr = br.readLine().trim();
            int N = Integer.parseInt(Nstr);
            
            char[] baseDigits = Nstr.toCharArray();
            Arrays.sort(baseDigits);
            String basePattern = new String(baseDigits);
            
            boolean possible = false;
            
            for (int k = 2; ; k++) {
                long multiple = (long) N * k;
                String mStr = String.valueOf(multiple);
                
                if (mStr.length() > Nstr.length()) break;
                
                char[] mDigits = mStr.toCharArray();
                Arrays.sort(mDigits);
                String mPattern = new String(mDigits);
                
                if (mPattern.equals(basePattern)) {
                    possible = true;
                    break;
                }
            }
            
            sb.append("#").append(t).append(" ")
              .append(possible ? "possible" : "impossible").append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
