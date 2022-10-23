class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        
//         for ( int i = 0; i < text1.length(); i++) {
//             for ( int j = 0; j < text2.length(); j++) {
//                 if ( text1.charAt(i) == text2.charAt(j) ) {
//                     dp[i + 1][j + 1] = dp[i][j] + 1;
//                 } else {
//                     dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
//                 }
//             }
//         }
//         System.out.println(Arrays.deepToString(dp));
//         return dp[text1.length()][text2.length()];
        
//     }
    // With O(n) Space
     public int longestCommonSubsequence(String text1, String text2) {
        int[] dp = new int[text2.length()+1];
        for(int i = 0; i< text1.length(); i++){
            int prev = dp[0];
            for(int j = 1; j < dp.length; j++){
                int temp = dp[j];
                if(text1.charAt(i) != text2.charAt(j-1)){
                    dp[j] = Math.max(dp[j-1], dp[j]);
                }else{
                    dp[j] = prev +1;
                }
                prev = temp;
            }
        }
        System.out.println((Arrays.toString(dp)));
        return dp[dp.length-1];
    }
}