class Solution {
    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            int max = 0;
            for (int x = i + 1; x < arr.length; x++){
                if (arr[x] > max) max = arr[x];
            }
            arr[i] = max;
        }

        arr[arr.length-1] = -1;

        return arr;

        
    }
}