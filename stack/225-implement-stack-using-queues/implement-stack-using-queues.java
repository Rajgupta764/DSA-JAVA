class MyStack {
     Queue<Integer> input;
     int size;
    public MyStack() {
        input=new LinkedList<>();
    }
    
    public void push(int x) {
        input.add(x);
        int n=input.size();
        for(int i=0;i<n-1;i++){
            input.add(input.remove());
        }
    }
    
    public int pop() {
        if(input.isEmpty()){
            return -1;
        }
        return input.remove();
    }
    
    public int top() {
        if(input.isEmpty()){
            return -1;
        }
        return input.peek();
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */