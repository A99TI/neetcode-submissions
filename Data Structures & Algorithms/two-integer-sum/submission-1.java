class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> prevNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            
            if (prevNums.containsKey(diff)){
                return new int[]{prevNums.get(diff), i};
            }

            prevNums.put(num, i);
        }

        return new int[] {};
        
    }
}
