class Solution {
    public int[] solution(String s) {
        int transforms = 0;
        int zeros = 0;

        while (!"1".equals(s)) {
            int onesLen = s.replace("0", "").length();
            zeros += s.length() - onesLen;
            s = Integer.toBinaryString(onesLen);
            transforms++;
        }

        return new int[]{transforms, zeros};
    }
}