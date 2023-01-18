class Solution {
    public static int maximumSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int num : nums){
            sum += num;
            ans = Math.max(sum, ans);
            if(sum < 0) sum = 0;
        }
        return ans;
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int nonCircularSum = maximumSubArray(nums);
        int totalSum = 0;
        for(int i=0;i < nums.length;i++){
            totalSum += nums[i];
            nums[i] = -1 * nums[i];
        }
        int ansMax = totalSum + maximumSubArray(nums);
        if(ansMax==0) return nonCircularSum;
        return Math.max(nonCircularSum, ansMax);
    }
}