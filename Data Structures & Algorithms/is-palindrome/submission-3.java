class Solution {
    public boolean isPalindrome(String s) {
        List<Character> letters = new ArrayList<>();

        for (char l : s.toCharArray()) {
            if (Character.isLetterOrDigit(l)) {
                letters.add(Character.toLowerCase(l));
            }
        }

        int left = 0;
        int right = letters.size()-1;

        while (left <= right){
            Character leftLetter = letters.get(left);
            Character rightLetter = letters.get(right);
            if (!leftLetter.equals(rightLetter)) return false;
            left++;
            right--;
        }

        
        return true;
    }
}