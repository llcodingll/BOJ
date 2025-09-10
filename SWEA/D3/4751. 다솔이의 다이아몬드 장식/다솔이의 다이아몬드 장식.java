import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 0; tc < T; tc++) {
            String str = br.readLine().trim();
            int n = str.length();
            int rows = 5;
            int cols = 4 * n + 1;

            char[][] grid = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = '.';
                }
            }

            for (int i = 0; i < n; i++) {
                int centerRow = 2;
                int centerCol = 2 + 4 * i;

                grid[centerRow][centerCol] = str.charAt(i);

                grid[centerRow - 2][centerCol] = '#';
                grid[centerRow - 1][centerCol - 1] = '#';
                grid[centerRow - 1][centerCol + 1] = '#';
                grid[centerRow][centerCol - 2] = '#';
                grid[centerRow][centerCol + 2] = '#';
                grid[centerRow + 1][centerCol - 1] = '#';
                grid[centerRow + 1][centerCol + 1] = '#';
                grid[centerRow + 2][centerCol] = '#';
            }

            for (int i = 0; i < rows; i++) {
                System.out.println(new String(grid[i]));
            }
        }
    }
}
