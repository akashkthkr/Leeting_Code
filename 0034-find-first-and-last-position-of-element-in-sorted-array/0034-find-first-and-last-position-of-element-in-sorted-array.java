class Solution {
    public int[] searchRange(int[] nums1, int target) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>(nums1.length);
        for ( int i : nums1) {
            nums.add(i);
        }
        int low = lowerBoundBinarySearch(nums, target);
        if ( low == nums.size() || nums.get(low) != target )
            return new int[]{-1, -1};
        int upp = lowerBoundBinarySearch(nums, target + 1);
        return new int[] {low, upp - 1};

    }
    public static int lowerBoundBinarySearch(List<Integer> nums, int target){
        int l = 0, r = nums.size(), mid;
        while(l < r) {
            mid = (l + r) / 2;
            if (nums.get(mid) < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}