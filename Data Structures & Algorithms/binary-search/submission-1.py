class Solution:
    def search(self, nums: List[int], target: int) -> int:

        leftP = 0
        rightP = len(nums) - 1

        while  leftP <= rightP:
            middle = (rightP + leftP) // 2

            if nums[middle] == target:
                return middle 

            if nums[middle] < target:
                leftP = middle + 1
            
            if nums[middle] > target:
                rightP = middle - 1
                

        return -1
        