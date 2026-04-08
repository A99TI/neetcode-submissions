class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        leftP = 0
        rightP = len(matrix) - 1

        while leftP <= rightP:
            middle = (rightP + leftP) // 2
            currList = matrix[middle]

            if target >= currList[0] and target <= currList[len(currList)-1]:
                lp = 0
                rp = len(currList) - 1
                while lp <= rp:
                    mid = (lp + rp) // 2
                    if currList[mid] == target:
                        return True
                    if currList[mid] < target:
                        lp = mid + 1
                    if currList[mid] > target:
                        rp = mid = 1
                return False 

            if target < currList[0]:
                rightP = middle - 1
            if target > currList[len(currList)-1]:
                leftP = middle + 1

        return False 

