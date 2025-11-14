import java.lang.StringBuilder;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        
        StringBuffer sb = new StringBuffer(three);
        three = sb.reverse().toString();
        
        answer = Integer.parseInt(three, 3);

        return answer;
    }
}