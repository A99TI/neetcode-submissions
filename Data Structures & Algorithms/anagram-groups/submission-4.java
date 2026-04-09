class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for (String str : strs) {
            int[] counts = new int[26];

            for (char c : str.toCharArray()) {
                int index = c - 'a';
                counts[index]++;
            }

            String key = Arrays.toString(counts);

            if (groups.containsKey(key)) {
                groups.get(key).add(str);
            } else {
                groups.put(key, new ArrayList<>());
                groups.get(key).add(str);
            }
        }

        return new ArrayList<>(groups.values());
    }
}