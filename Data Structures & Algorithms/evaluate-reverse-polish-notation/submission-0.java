class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        

        for(String token: tokens){
            if (token.equals("+")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int total = num1 + num2;
                stack.push(total);

            } else if (token.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int total = num2 - num1;
                stack.push(total);

            } else if (token.equals("*")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int total = num1 * num2;
                stack.push(total);

            } else if (token.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int total = num2 / num1;
                stack.push(total);
            } else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        
        return stack.pop();
    }
}
