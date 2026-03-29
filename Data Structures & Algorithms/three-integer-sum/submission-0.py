class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)

        # triple nested loops with correct bounds
        for i in range(0, n - 2):
            for j in range(i + 1, n - 1):
                for k in range(j + 1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        triplet = sorted([nums[i], nums[j], nums[k]])
                        result.append(tuple(triplet))   # use tuple to avoid duplicate lists

        # remove duplicates
        result = list(set(result))

        # convert back to lists
        return [list(t) for t in result]