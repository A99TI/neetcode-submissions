class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Deque<int[]> temps = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
            while (temps.size() > 0 && temperatures[i] > temps.peek()[1]){
                int colderTempPosition = temps.pop()[0];
                result[colderTempPosition] = i - colderTempPosition;
            }
            temps.push(new int[]{i, temperatures[i]});
        }

        return result;
        
    }
}
