import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String S = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : S.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            if (map.size() == 2 && map.values().stream().allMatch(count -> count == 2)) {
                sb.append("#").append(t).append(" Yes\n");
            } else {
                sb.append("#").append(t).append(" No\n");
            }
        }

        System.out.print(sb);
    }
}