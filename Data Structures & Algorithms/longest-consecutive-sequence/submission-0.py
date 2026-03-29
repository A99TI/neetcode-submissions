class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        numSet = set(nums)
        longestCons = 1

        while len(numSet) != 0:

            # Pick an actual value from the set
            curr_smallest = next(iter(numSet))

            # Find the smallest number remaining in the set
            for num in numSet:
                if num < curr_smallest:
                    curr_smallest = num
                
            numSet.remove(curr_smallest)
            currentLongestCons = 1

            # Count upward
            while True:
                next_num = curr_smallest + 1
                if next_num in numSet:
                    currentLongestCons += 1
                    numSet.remove(next_num)
                    curr_smallest = next_num
                else:
                    longestCons = max(longestCons, currentLongestCons)
                    break

        return longestCons
