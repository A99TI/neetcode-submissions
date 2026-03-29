class Solution:
    def maxArea(self, heights: List[int]) -> int:

        largestVolume = 0
        lp = 0
        rp = len(heights) - 1
        
        while lp != rp:
        
            length = rp - lp
            minSide = min(heights[lp],heights[rp])

            currVolume = length * minSide

            largestVolume = max(largestVolume, currVolume)

            if heights[lp] < heights[rp]:
                lp += 1
            else:
                rp -= 1
        
        return largestVolume




