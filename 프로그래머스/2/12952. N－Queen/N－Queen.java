import java.util.*;
class Solution {
    int count = 0;
    
    public int solution(int n) {
        dfs(0, n, new int[n]);
        return count;
    }
    
    void dfs(int row, int n, int[] cols) {
        if (row == n) {
            count++;
            return;
        }
        
        // 모든 열 시도
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, cols)) {
                cols[row] = col;
                dfs(row + 1, n, cols);
            }
        }
    }
    
    boolean isSafe(int row, int col, int[] cols) {
        for (int r = 0; r < row; r++) {
            int c = cols[r];
            if (c == col || Math.abs(row-r) == Math.abs(col-c)) {
                return false;
            }
        }
        return true;
    }
}