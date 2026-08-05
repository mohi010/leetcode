class MinStack {
    public long mini;
    public Stack<Long> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if (st.isEmpty()) {
            mini = value;
            st.push((long) value);
        } else {
            if (value >= mini) {
                st.push((long) value);
            } else {
                long x = 2L * value - mini;
                st.push(x);
                mini = value;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < mini) {
            mini = 2L * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x < mini) return (int) mini;
        return (int) x;
    }

    public int getMin() {
        return (int) mini;
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