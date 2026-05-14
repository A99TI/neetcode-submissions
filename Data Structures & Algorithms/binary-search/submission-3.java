class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int middle = left + ((right-left)/2);
            int num = nums[middle];
            
            if (num == target) {
                return middle;
            } else if (target < num) {
                right = middle - 1;
            } else{
                left = middle + 1;
            } 
        }

        return -1;
        
    }
}
