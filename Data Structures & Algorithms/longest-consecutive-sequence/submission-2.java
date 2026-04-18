class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for (int num: nums){
            set.add(num);
        }


        for (int num: nums){
            if (!set.contains(num)) continue;
            if (set.contains(num-1)) continue;
            
            set.remove(num);
            int currValue = num;
            int currResult = 1;
            
            while(set.contains(currValue+1)){
                set.remove(currValue);
                currValue++;
                currResult++;
            }

            result = Math.max(result, currResult);

        }

        return result;
        
    }
}
