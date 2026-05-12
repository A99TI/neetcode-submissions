class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> numCount = new HashMap<>();

        for(int num: nums){
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num: numCount.keySet()){
            int frequency = numCount.get(num);
            buckets.get(frequency).add(num);
        }

        int[] result = new int[k];
        int idx = 0;

        for (int freq = nums.length; freq >= 0; freq--) {
            for (int num : buckets.get(freq)) {
                result[idx++] = num;
                if (idx == k) {
                    return result;
                }
            }
        }

        return result;
        
    }
}
