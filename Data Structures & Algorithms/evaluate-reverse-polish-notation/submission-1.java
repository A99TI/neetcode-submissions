class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> numStack = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = numStack.pop();
                int num2 = numStack.pop();

                if (token.equals("+")) {
                    numStack.push(num2 + num1);
                } 
                if (token.equals("-")) {
                    numStack.push(num2 - num1);
                }
                if (token.equals("*")) {
                    numStack.push(num2 * num1);
                } 
                if (token.equals("/")) {
                    numStack.push(num2 / num1);                
                }

            } else {
                numStack.push(Integer.parseInt(token));
            }
        }

        return numStack.pop();
    }
}