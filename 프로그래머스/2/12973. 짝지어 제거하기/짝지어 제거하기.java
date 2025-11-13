class Solution {
    public int solution(String s) {
        int length = s.length();
        char[] stack = new char[length];
        int top = -1;

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (top >= 0 && stack[top] == currentChar) {
                top--;
            } else {
                stack[++top] = currentChar;
            }
        }

        return top == -1 ? 1 : 0;
    }
}
