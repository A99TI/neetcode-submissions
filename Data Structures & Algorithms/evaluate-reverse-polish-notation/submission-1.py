class Solution:
    def evalRPN(self, tokens: List[str]) -> int:

        operStack = []

        while len(tokens) != 0:
            operStack.append(tokens.pop())

        total = float(operStack.pop())

        while len(operStack) != 0:
            number = float(operStack.pop())
            operation = operStack.pop()
            print (total, number, operation)

            if operation == "+":
                total += number
            if operation == "-":
                total == number
            if operation == "*":
                total *= number
            if operation == "/":
                total /= number

        return int(total)
            


        