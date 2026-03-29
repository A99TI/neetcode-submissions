class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        lpp = 0
        rpp = len(numbers) - 1
        total = numbers[lpp] + numbers[rpp]

        while total != target:
            if total > target:
                rpp -=1
            if total < target:
                lpp += 1
            total = numbers[lpp] + numbers[rpp]

        return [lpp+1, rpp+1 ]
        

        