import java.util.*;
class Solution {
    private int solutionCount = 0;
    
    public int solution(int n) {
        int[] queensColumnPositions = new int[n];
        placeQueenInRow(0, n, queensColumnPositions);
        return solutionCount;
    }
    
    private void placeQueenInRow(int currentRow, int n, int[] queensColumnPositions) {
        if (currentRow == n) {
            solutionCount++;
            return;
        }
        
        for (int candidateColumn = 0; candidateColumn < n; candidateColumn++) {
            if (isSafePosition(currentRow, candidateColumn, queensColumnPositions)) {
                queensColumnPositions[currentRow] = candidateColumn;
                placeQueenInRow(currentRow + 1, n, queensColumnPositions);
            }
        }
    }
    
    private boolean isSafePosition(int targetRow, int targetColumn, int[] queensColumnPositions) {
        for (int previousRow = 0; previousRow < targetRow; previousRow++) {
            int previousColumn = queensColumnPositions[previousRow];
            
            if (previousColumn == targetColumn) {
                return false;
            }
            
            if (Math.abs(targetRow - previousRow) == Math.abs(targetColumn - previousColumn)) {
                return false;
            }
        }
        return true;
    }
}