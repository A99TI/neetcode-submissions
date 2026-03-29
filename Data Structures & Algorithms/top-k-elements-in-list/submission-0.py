class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

            frequency = defaultdict(int)

            for num in nums:
                frequency[num] += 1

            frequencies = list(frequency.values())
            frequencies.sort(reverse=True)

            result = []

            for key, value in frequency.items():
                if value in frequencies[:k]:
                    result.append(key)

            return result

        