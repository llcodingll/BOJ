import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            List<String> list = new LinkedList<>();
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(st.nextToken());
            }
            
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < M; i++) {
                String cmd = st.nextToken();
                
                if (cmd.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        list.add(x + j, st.nextToken());
                    }
                } else if (cmd.equals("D")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        if (x < list.size()) {
                            list.remove(x);
                        }
                    }
                } else if (cmd.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());
                    for (int j = 0; j < y; j++) {
                        list.add(st.nextToken());
                    }
                }
            }
            
            sb.append("#").append(t).append(" ");
            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
