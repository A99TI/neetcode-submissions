class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        numSet = set(nums)
        longest = 0

        for num in numSet:
            
            leftN = num - 1

            if leftN not in numSet:

                nextN = num + 1
                currLongest = 1

                while nextN in numSet:
                    currLongest += 1
                    nextN = nextN + 1
                
                longest = max(longest, currLongest)
        
        return longest
                




        
