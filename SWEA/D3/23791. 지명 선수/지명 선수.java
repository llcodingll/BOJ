import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            int[] A = new int[N];
            int[] B = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            char[] team = new char[N + 1];
            boolean[] selected = new boolean[N + 1];
            int aIdx = 0, bIdx = 0;
            boolean aTurn = true;

            for (int i = 0; i < N; i++) {
                if (aTurn) {
                    while (selected[A[aIdx]]) aIdx++;
                    team[A[aIdx]] = 'A';
                    selected[A[aIdx]] = true;
                    aIdx++;
                } else {
                    while (selected[B[bIdx]]) bIdx++;
                    team[B[bIdx]] = 'B';
                    selected[B[bIdx]] = true;
                    bIdx++;
                }
                aTurn = !aTurn;
            }

            for (int i = 1; i <= N; i++) {
                result.append(team[i]);
            }
            result.append("\n");
        }

        System.out.print(result);
    }
}
