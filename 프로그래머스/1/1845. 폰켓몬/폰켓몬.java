import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length/2;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        
        int types = map.size();
        
        int answer = 0;
        answer = max<types?max: types;
        return answer;
    }
}