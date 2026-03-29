class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        
    def pop(self) -> None:
        if len(self.stack) == 0:
            return 
        else:
            self.stack.pop()
        
    def top(self) -> int:
        if len(self.stack) == 0:
            return None
        else:
            lastIndex = len(self.stack) - 1
            return self.stack[lastIndex]
        
    def getMin(self) -> int:
        if len(self.stack) == 0:
            return None
        else:
            minNum = self.stack[0]
            for num in self.stack:
                minNum = min(num, minNum)

        return minNum
                
        
