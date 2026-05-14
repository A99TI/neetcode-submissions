class MinStack {

    Deque<Integer> mainstack;
    Deque<Integer> minstack;

    public MinStack() {
        mainstack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
        
    }
    
    public void push(int val) {

        mainstack.push(val);

        if (minstack.size() == 0){
            minstack.push(val);
        } else{
            int lowestValue = Math.min(minstack.peek(), val);
            minstack.push(lowestValue);
        }
        
    }
    
    public void pop() {
        mainstack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return mainstack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}
