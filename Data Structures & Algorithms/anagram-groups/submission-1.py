class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        

        anagrams = defaultdict(list)

        for word in strs:

            immutable_key = tuple(sorted(Counter(word)))

            anagrams[immutable_key].append(word)
        
    
        return anagrams.values()
