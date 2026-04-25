class Solution {
    public int largestRectangleArea(int[] heights) {

        Deque<int[]> stack = new ArrayDeque<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++){
            int currentExtent = i;
            while (!stack.isEmpty() && heights[i] < stack.peek()[1] ){
                int[] bar = stack.pop();
                currentExtent = bar[0];

                int width = i - bar[0] ;
                int area = width * bar[1];
                maxArea = Math.max(maxArea, area);
            }

            stack.push(new int[]{currentExtent, heights[i]});
        }

        for(int[] bar: stack){
                int width = heights.length - bar[0];
                int area = width * bar[1];
                maxArea = Math.max(maxArea, area);
        }

        return maxArea;      
    }
}
