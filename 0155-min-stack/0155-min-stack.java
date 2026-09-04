class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        
        st.push(value);
        if( min.isEmpty() || value<=min.peek()){
            min.push(value);
        }
    }
    
    public void pop() {
        if(! st.isEmpty() && ! min.isEmpty() && st.peek().equals(min.peek()) ){
            min.pop();
        }

        if(! st.isEmpty()){
            st.pop();
        }

        
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();  
        }
        return 0;
    } 
    
    public int getMin() {
        if(!min.isEmpty()){
            return min.peek();
        }
        return 0;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */