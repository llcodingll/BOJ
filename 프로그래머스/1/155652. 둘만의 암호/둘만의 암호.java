class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            
            for(int k = 0; k < index; k++){
                cur++;
                
                if(cur > 'z'){
                    cur = 'a';
                }
                
                for(int j = 0; j < skip.length(); j++){
                    if(cur == skip.charAt(j)){
                        cur++;
                        if(cur > 'z'){
                            cur = 'a';
                        }
                        j = -1;
                    }
                }
            }
            
            sb.append(cur);
        }
        
        answer = sb.toString();
        return answer;
    }
}