class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        
        for(int idx = 0; idx < s.length(); idx++){
            char c = s.charAt(idx);
            
            if(c == ' '){
                sb.append(c);
                isFirst = true;
            } else {
                if(isFirst){
                    sb.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }
}