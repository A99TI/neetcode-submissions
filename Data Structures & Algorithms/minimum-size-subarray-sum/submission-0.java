class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = nums.length + 1;
        int total = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++){
            total += nums[r];
            while (total >= target){
                result = (Math.min(r-l, result));
                total -= nums[l];
                l++;
            }
        }

        if (result == nums.length + 1) return 0;
        return result + 1;
    }
}