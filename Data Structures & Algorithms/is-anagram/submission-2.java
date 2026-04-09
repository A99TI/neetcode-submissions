class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();

        for (char l : s.toCharArray()) {
            s1.put(l, s1.getOrDefault(l, 0) + 1);
        }

        for (char l : t.toCharArray()) {
            s2.put(l, s2.getOrDefault(l, 0) + 1);
        }

        if (s1.equals(s2)){
            return true;
        } else {
            return false;
        }
        



    }
}
