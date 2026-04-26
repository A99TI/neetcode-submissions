class Solution {
    public int bananaHours(int[] piles, int speed){
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (int) Math.ceil((double) pile / speed);
        }

        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = 0;
        
        for (int pile: piles){
            maxVal = Math.max(maxVal, pile);
        }

        int left = 1;
        int right = maxVal;
        int res = maxVal;

        while (left <= right){
            int middle = left + ((right-left) / 2);
            
            if (bananaHours(piles, middle) > h){
                left = middle  + 1;
            } else if (bananaHours(piles, middle) <= h) {
                res = middle;
                right = middle - 1;
            }            
        }
        
        return res;
    }
}