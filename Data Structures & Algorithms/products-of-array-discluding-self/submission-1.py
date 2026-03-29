class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre = []
        post = []
        result = []

        pre_total = 1
        for num in nums:
            pre_total *= num
            pre.append(pre_total)
        
        post_total = 1
        for i in range(len(nums) - 1, -1, -1):
            post_total *= nums[i]
            post.append(post_total)
        post.reverse()


        for i, val in enumerate(nums):
            pre_val = pre[i-1] if i-1 >= 0 else 1
            post_val = post[i+1] if i+1 < len(nums) else 1
            result_val = pre_val * post_val
            result.append(result_val)

        return result


        
