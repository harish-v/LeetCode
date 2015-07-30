class MyQueue {
    Stack<Integer> primary = new Stack<>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        primary.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> sec = new Stack<>();
        
        while(!primary.empty()){
            sec.push(primary.pop());
        }
        
        sec.pop();
        while(!sec.empty()){
            primary.push(sec.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack<Integer> sec = new Stack<>();
        
        while(!primary.empty()){
            sec.push(primary.pop());
        }
        
        int ret = sec.peek();
        while(!sec.empty()){
            primary.push(sec.pop());
        }
        
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return primary.empty();
    }
}
