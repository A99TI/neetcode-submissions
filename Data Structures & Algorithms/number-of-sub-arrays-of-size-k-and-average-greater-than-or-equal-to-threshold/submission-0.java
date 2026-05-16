class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int result = 0;
        int total = 0;
        int l = 0;

        for (int r = 0; r < arr.length; r++){
            total += arr[r];
            if (r-l+1 == k){
                if (total/k >= threshold) result++;
                total -= arr[l];
                l++;
            }
        }

        return result;
        
    }
}