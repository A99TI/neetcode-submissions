class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque<>();
        
        for(int i = 0; i < temperatures.length; i++){
            int currentTemp = temperatures[i];

            while (!stack.isEmpty() && stack.peek()[1] < currentTemp) {
                int[] temp = stack.pop();
                int oldIndex = temp[0];

                result[oldIndex] = i - oldIndex;
            }
            stack.push(new int[]{i, currentTemp});
            
        }

        return result;
        
    }
}
