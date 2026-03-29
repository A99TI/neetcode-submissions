class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_s = re.sub(r'[^a-zA-Z0-9]', '', s)
        middle = math.floor(len(clean_s)/2)
        
        for i in range(middle):
            first_c =  clean_s[i].lower()
            last_c = clean_s[(len(clean_s) - i - 1)].lower()
            if first_c != last_c:
                return False
        
        return True