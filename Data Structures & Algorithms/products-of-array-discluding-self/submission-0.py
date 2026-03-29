class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        noOfZero = 0
        wholeNumberRes = 1

        for num in nums:
            if num == 0:
                noOfZero += 1
            else:
                wholeNumberRes *= num


        if noOfZero > 1:
            result = [0] * len(nums)
        elif noOfZero == 1:
            for num in nums:
                if num == 0:
                    result.append(wholeNumberRes)
                else:
                    result.append(0)
        else:
            for num in nums:
                numberRes = int(wholeNumberRes/num)
                result.append(numberRes)

        return result        
        