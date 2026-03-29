class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        pairs = {
            "(": ")",
            "{": "}",
            "[": "]"
        }

        for c in s:

            if c in pairs:                 
                stack.append(c)
            else:                           
                if len(stack) == 0:
                    return False
                    
                item = stack.pop()

                if pairs[item] != c:        
                    return False
        
        return len(stack) == 0
                
            
