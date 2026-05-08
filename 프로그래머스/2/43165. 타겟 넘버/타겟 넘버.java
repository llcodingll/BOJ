import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int idx, int sum){
        
        while(idx == numbers.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        
        int plusSuccess = dfs(numbers, target, idx+1, sum+numbers[idx]);
        int minusSuccess = dfs(numbers, target, idx+1, sum-numbers[idx]);
        
        return plusSuccess+minusSuccess;
    }
}