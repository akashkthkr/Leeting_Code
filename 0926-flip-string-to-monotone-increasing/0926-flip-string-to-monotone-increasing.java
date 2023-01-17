class Solution {
    public static int minFlipsMonoIncr(String s) {
        int numOfZero = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') numOfZero++;
        }
        int finalAns = numOfZero;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                finalAns = Math.min(--numOfZero, finalAns);
            } else {
                numOfZero++;
            }

        }
        return finalAns;
    }
}