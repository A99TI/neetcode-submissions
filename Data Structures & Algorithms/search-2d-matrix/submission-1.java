class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int outterLeft = 0;
        int outterRight = matrix.length - 1;

        while (outterLeft <= outterRight) {
            int outterMiddle = outterLeft + ((outterRight - outterLeft) / 2);
            int[] currMatrix = matrix[outterMiddle];

            if (target >= currMatrix[0] && target <= currMatrix[currMatrix.length - 1]){
                int innerLeft = 0;
                int innerRight = currMatrix.length - 1;

                while (innerLeft <= innerRight){
                    int innerMiddle = innerLeft + ((innerRight - innerLeft) / 2);
                    if (currMatrix[innerMiddle] == target){
                        return true;
                    } else if (target > currMatrix[innerMiddle]  ){
                        innerLeft = innerMiddle + 1;
                    } else {
                        innerRight = innerMiddle - 1;
                    }
                }
                return false;

            } else if (target < currMatrix[0]){
                outterRight = outterMiddle - 1;
            } else{
                outterLeft = outterMiddle + 1;
            }
        }

        return false;

    }
}
