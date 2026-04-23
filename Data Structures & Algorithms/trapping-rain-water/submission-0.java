class Solution {
    public int trap(int[] height) {

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int total = 0;
        
        int currMax = 0;
        for (int i = 0; i < height.length; i++) {
            maxLeft[i] = currMax;
            currMax = Math.max(currMax, height[i]);
        }

        currMax = 0;
        for (int i = height.length-1; i >= 0; i--) {
            maxRight[i] = currMax;
            currMax = Math.max(currMax, height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            int totalCap = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if (totalCap > 0) total+= totalCap;
        }
        
        return total;
        
    }
}
