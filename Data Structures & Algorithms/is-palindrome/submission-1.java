class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 <= p2) {
            if (p1 < s.length() && !Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
                continue;
            }

            if (p2 >= 0 && !Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
}
