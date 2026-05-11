class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();

        for (char l: s.toCharArray()){
            s1.put(l, s1.getOrDefault(l, 0) + 1);
        }

        for (char l: t.toCharArray()){
            s2.put(l, s2.getOrDefault(l, 0) + 1);
        }

        if (s1.size() != s2.size()){
            return false;
        }

        for (char l: s1.keySet()){
            if (!s1.get(l).equals(s2.get(l))) return false;
        }

        return true;

    }
}
