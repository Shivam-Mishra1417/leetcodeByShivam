
class MinStack {
    
    Stack<Node> st;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack<Node>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            Node n = new Node(val,val);
            st.push(n);
        }
        else{
            Node tmp = st.peek();
            Node n = new Node(val, (tmp.min<val)?tmp.min:val);
            st.push(n);
                }
        
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        //System.out.println(st);
        return st.peek().min;
    }
}
class Node{
    int val;
    int min;
    public Node(int c, int m){
        val = c;
        min = m;
    }
    public String toString(){
        return val +"  "+min; 
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */