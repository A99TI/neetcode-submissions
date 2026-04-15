class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] freq = new int[k];

        for (int i = 0; i < k; i++) {
            freq[i] = entries.get(i).getKey();
        }

        return freq;
    }
}
