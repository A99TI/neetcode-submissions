class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for (String s: strs){
            int[] counts =  new int[26];

            for (char l: s.toCharArray()){
                int position = l - 'a';
                counts[position]++;
            }

            String key = Arrays.toString(counts);

            if (groups.containsKey(key)) {
                groups.get(key).add(s);
            } else {
                groups.put(key, new ArrayList<>());
                groups.get(key).add(s);
            }

        }

        return new ArrayList<>(groups.values());
    }
}