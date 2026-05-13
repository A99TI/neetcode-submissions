class Solution {
    public int trap(int[] height) {

        int[] forward = new int[height.length];
        int largest = 0;
        for (int i = 0; i < height.length; i++){   
            forward[i] = largest;
            largest = Math.max(largest, height[i]);
        }

        int[] back = new int[height.length];
        largest = 0;
        for (int i = height.length-1; i >= 0; i--){   
            back[i] = largest;
            largest = Math.max(largest, height[i]);
        }

        int total = 0;
        for (int i = 0; i < height.length; i++){   
            int hold = (Math.min(forward[i], back[i])) - height[i];
            if (hold > 0) total += hold;
        }

        return total;
        
    }
}
