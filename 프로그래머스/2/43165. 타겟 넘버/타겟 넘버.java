import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Deque<boolean[]> que = new ArrayDeque<>();
        
        que.add(new boolean[] {true});
        que.add(new boolean[] {false});
        
        while(!que.isEmpty()){
            boolean[] sings = que.pop();
            
            if(sings.length == numbers.length){
                int sum = 0;
                for(int i = 0; i < numbers.length; i++)
                    sum += sings[i] ? numbers[i] : -numbers[i];
                
                if(sum == target) answer++;
                continue;
            }
            
            boolean[] tmp = new boolean[sings.length+1];
            
            for(int j = 0; j < sings.length; j++){
                tmp[j] = sings[j];
            }
            que.add(tmp.clone());
            
            tmp[tmp.length-1] = true;
            que.add(tmp.clone());
        }
        return answer;
    }
}