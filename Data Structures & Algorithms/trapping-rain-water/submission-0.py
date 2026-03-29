class Solution:
    def trap(self, height: List[int]) -> int:

        totalWaterStore = 0
        maxLeft = []
        maxRight = []

        maxLH = 0
        for h in height:
            if h > maxLH:
                maxLH = h
            maxLeft.append(maxLH)

        maxRH = 0
        for h in reversed(height):
            if h > maxRH:
                maxRH = h
            maxRight.append(maxRH)
        maxRight.reverse()


        for i in range(len(height)):
            waterStored = min(maxLeft[i],maxRight[i]) - height[i]
            if waterStored > 0:
                totalWaterStore +=waterStored

        
        return totalWaterStore

        


        