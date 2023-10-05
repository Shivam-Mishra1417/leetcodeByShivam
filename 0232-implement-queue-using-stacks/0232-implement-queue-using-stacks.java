class MyQueue {
    Stack s1 , s2;
    int pk;
    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(s1.empty())
        pk =x;
        s1.push(x);
    }
    
    public int pop() {
        
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int x = (int)s2.pop();
        if(!s2.empty())
        pk =(int) s2.peek();
        while(!s2.empty())
        s1.push(s2.pop());
        return x;
    }
    
    public int peek() {
        return pk;
    }
    
    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */