class Solution {
    public int minDeletionSize(String[] strs) {
         if (strs[0].length() == 0) return 0;
        int ans = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for ( int j = 1; j < strs.length; j++) {
                if ((int) strs[j].charAt(i) < (int) strs[j-1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}