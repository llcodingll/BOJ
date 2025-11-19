import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Set<Integer> result = new HashSet<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}