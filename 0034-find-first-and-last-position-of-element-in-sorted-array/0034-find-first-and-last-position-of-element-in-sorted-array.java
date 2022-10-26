class Solution {
    public int[] searchRange(int[] nums1, int target) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<Integer>() {{ for (int i : nums1) add(i); }};
        // int low = Collections.binarySearch(nums, target);
        // if (low < 0) return new int[]{-1, -1};
        // int upp = Collections.binarySearch(nums, target + 1);
        // if (upp < 0) upp = Math.abs(upp) - 1;
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