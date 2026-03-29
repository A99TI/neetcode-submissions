class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
    
        s_letters = defaultdict(int)
        for l in s:
            s_letters[l] += 1

        t_letters = defaultdict(int)    
        for l in t:
            t_letters[l] += 1

        if t_letters == s_letters:
            return True
        else:
            return False 






        ## Map t into a hashmap

        ## COmpare then 
        

        