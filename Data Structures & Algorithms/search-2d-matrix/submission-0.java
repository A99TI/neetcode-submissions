class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int outerLeft = 0;
        int outerRight = matrix.length - 1;

        while (outerLeft <= outerRight) {

            int outerMiddle = outerLeft + ((outerRight - outerLeft) / 2);
            int[] currMatrix = matrix[outerMiddle];

            if (target < currMatrix[0]) {
                outerRight = outerMiddle - 1;

            } else if (target > currMatrix[currMatrix.length - 1]) {
                outerLeft = outerMiddle + 1;

            } else {
                int left = 0;
                int right = currMatrix.length - 1;

                while (left <= right) {
                    int middle = left + ((right - left) / 2);

                    if (target > currMatrix[middle]) {
                        left = middle + 1;
                    } else if (target < currMatrix[middle]) {
                        right = middle - 1;
                    } else {
                        return true;
                    }
                }

                return false;
            }
        }

        return false;
    }
}