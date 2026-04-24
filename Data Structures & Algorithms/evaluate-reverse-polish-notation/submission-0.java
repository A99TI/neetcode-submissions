class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                int num = Integer.parseInt(token);
                stack.push(num);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();

                int total = 0;

                if (token.equals("+")) {
                    total = num2 + num1;
                } else if (token.equals("-")) {
                    total = num2 - num1;
                } else if (token.equals("*")) {
                    total = num2 * num1;
                } else if (token.equals("/")) {
                    total = num2 / num1;
                }

                stack.push(total);
            }
        }

        return stack.pop();
    }
}