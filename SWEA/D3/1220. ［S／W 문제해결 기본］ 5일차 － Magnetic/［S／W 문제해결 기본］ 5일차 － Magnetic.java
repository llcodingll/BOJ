import java.io.*;
import java.util.*;

public class Solution {
    private static int[] parseRow(String line, int N) {
        StringTokenizer st = new StringTokenizer(line);
        int[] row = new int[N];

        if (st.countTokens() >= N) {
            for (int i = 0; i < N; i++) row[i] = Integer.parseInt(st.nextToken());
            return row;
        }

        int idx = 0;
        for (int i = 0; i < line.length() && idx < N; i++) {
            char c = line.charAt(i);
            if (c == '0' || c == '1' || c == '2') {
                row[idx++] = c - '0';
            }
        }
        while (idx < N) row[idx++] = 0;
        return row;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = 1;
        String line;

        while (t <= 10 && (line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            int N = Integer.parseInt(line);
            int[][] board = new int[N][N];

            for (int r = 0; r < N; r++) {
                String rowLine = br.readLine();
                while (rowLine != null && rowLine.trim().isEmpty()) {
                    rowLine = br.readLine();
                }
                if (rowLine == null) rowLine = "";
                board[r] = parseRow(rowLine, N);
            }

            int deadlocks = 0;
            for (int c = 0; c < N; c++) {
                boolean seenN = false;
                for (int r = 0; r < N; r++) {
                    int v = board[r][c];
                    if (v == 1) {
                        seenN = true;
                    } else if (v == 2) {
                        if (seenN) {
                            deadlocks++;
                            seenN = false;
                        }
                    }
                }
            }

            out.append('#').append(t).append(' ').append(deadlocks).append('\n');
            t++;
        }

        System.out.print(out.toString());
    }
}
