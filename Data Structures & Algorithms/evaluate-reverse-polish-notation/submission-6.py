class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        numStack = []

        for token in tokens:
            if token.isdigit():
                numStack.append(token)
            else:
                num2 = float(numStack.pop())
                num1 = float(numStack.pop())
                print(num1, num2)
                
                total = 0
                if token == "+":
                    total = num1 + num2
                if token == "-":
                    total = num1 - num2
                if token == "*":
                    total = num1 * num2
                if token == "/":
                    total = num1 / num2

                numStack.append(int(total))

        return numStack[0]
 
         


        