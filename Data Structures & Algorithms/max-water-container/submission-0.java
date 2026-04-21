class Solution {
    public int maxArea(int[] heights) {

        int p1 = 0;
        int p2 = heights.length - 1;
        int result = 0;

        while (p1 < p2){
            int width = p2 - p1;
            int height = Math.min(heights[p2], heights[p1]);
            int area = width * height;
            result = Math.max(result, area);

            if (heights[p1] > heights[p2]){
                p2--;
            } else if (heights[p2]> heights[p1]){
                p1++;
            } else{
                if (heights[p2-1] > heights[p1+1]){
                    p2--;
                } else{
                    p1++;
                }
            }
        }

        return result;
        
    }
}
