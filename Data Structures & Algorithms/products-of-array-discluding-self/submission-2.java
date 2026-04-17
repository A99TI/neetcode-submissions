class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] forward = new int[n];
        int[] backwards = new int[n];

        int currTotal = 1;
        for(int i = 0; i < n; i++){
            currTotal *= nums[i];
            forward[i] = currTotal;
        }

        currTotal = 1;
        for(int i = n-1 ; i >= 0; i--){
            currTotal *= nums[i];
            backwards[i] = currTotal;
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int left = (i > 0) ? forward[i - 1] : 1;
            int right = (i < n - 1) ? backwards[i + 1] : 1;
            ans[i] = left * right;
        }
        
        return ans;
        
    }
}  
