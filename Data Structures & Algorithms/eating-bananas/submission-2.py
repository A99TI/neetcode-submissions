class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        lp = 1
        rp = max(piles)
        result = rp

        while lp <= rp:

            mid = (lp + rp) // 2
            totalH = 0

            for bananas in piles:
                totalH += math.ceil(bananas / mid)

            if totalH <= h:
                result = mid
                rp = mid - 1
            else:
                lp = mid + 1

        return result
