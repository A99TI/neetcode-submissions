class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int p1 = 0;
        int p2 = numbers.length - 1;

        while (p1 < p2) {
            int total = numbers[p1] + numbers[p2];
            if (total == target){
                return new int[]{p1+1, p2+1};
            }
            if (total > target){
                p2--;
            }
            if (total < target){
                p1++;
            }
        }

        return new int[]{};
    }
}
