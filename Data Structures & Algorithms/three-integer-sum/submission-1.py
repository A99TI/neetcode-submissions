class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        n = len(nums)

        for i in range(n - 2):
            # Skip duplicate values for i
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            l = i + 1
            r = n - 1   

            while l < r:  # FIXED: must be l < r
                total = nums[i] + nums[l] + nums[r]

                if total == 0:
                    result.append([nums[i], nums[l], nums[r]])

                    # Skip duplicates on left
                    while l < r and nums[l] == nums[l + 1]:
                        l += 1
                    # Skip duplicates on right
                    while l < r and nums[r] == nums[r - 1]:
                        r -= 1

                    l += 1
                    r -= 1

                elif total > 0:
                    r -= 1
                else:
                    l += 1

        return result