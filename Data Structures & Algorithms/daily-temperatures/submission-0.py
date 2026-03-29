class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        results = [0] * len(temperatures)
        numStack = []  # [value, index]

        for i, t in enumerate(temperatures):
            while numStack and t > numStack[-1][0]:
                value, position = numStack.pop()
                results[position] = i - position

            numStack.append([t, i])

        return results