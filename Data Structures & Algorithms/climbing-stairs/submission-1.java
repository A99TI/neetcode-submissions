class Solution {
    public int climbStairs(int n) {
        return climb(n);
    }

    private int climb(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        return climb(n - 1) + climb(n - 2);
    }
}
