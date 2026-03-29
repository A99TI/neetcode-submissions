class MinStack {

    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);

        if (minStack.size() == 0){
            minStack.add(val);
        } else {
            int currentMin = minStack.get(minStack.size() - 1);
            if (val < currentMin){
                minStack.add(val);
            } else {
                minStack.add(currentMin);
            }
        }
    }
    
    public void pop() {
        minStack.remove(stack.size() - 1);
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(stack.size() - 1);
    }
}
