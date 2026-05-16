class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();
        char[] string = s.toCharArray();

        int result = 0;
        int l = 0;

        for (int r = 0; r <= string.length - 1; r++){
            
            char currLetter = string[r];

            while (seen.contains(currLetter)){
                seen.remove(string[l]);
                l++;
            }

            result = Math.max(r-l+1, result);
            seen.add(currLetter);
        }

        return result;
        
    }
}
