class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        numStack = []

        for token in tokens:

            if token.lstrip('-').isdigit():
                numStack.append(int(token))
            else:
                num2 = numStack.pop()
                num1 = numStack.pop()

                if token == "+":
                    numStack.append(num1 + num2)
                elif token == "-":
                    numStack.append(num1 - num2)
                elif token == "*":
                    numStack.append(num1 * num2)
                elif token == "/":
                    numStack.append(int(num1 / num2))

        return numStack[-1]
