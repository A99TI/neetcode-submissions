class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        int currFasted = 0;

        for (int pile: piles) right = Math.max(right, pile);

        while (left <= right){

            int middle = left + ((right-left)/2);

            int duration = 0;
            for (int pile: piles){
                duration += Math.ceil((double) pile / middle);
            }

            if (duration <= h){
                currFasted = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return currFasted;
        
        
    }
}
