class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n==1) return heights[0]; 
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        nse[n-1] = n;
        pse[0] = -1;
        // ---------------nse 
        st.push(n-1);
        for (int i = n-2; i>=0; i--){
            while(st.size()>0 && heights[i]<=heights[st.peek()]) st.pop();
            if (st.size()==0) {
                nse[i] = n;
            }
            else  nse[i] = st.peek();
            st.push(i);
        }
        st.clear();
        // ----------------------pse
        st.push(0);
        for (int i =1; i<n; i++){
            while(st.size()>0 && heights[i]<=heights[st.peek()]) st.pop();
            if (st.size()==0) {
                pse[i] = -1;
            }
            else pse[i] = st.peek();
            st.push(i);
        }
        int area = 0;
        for (int i =0; i<n; i++){
            area = Math.max(area, heights[i]*(nse[i]-pse[i]-1));
        }
        return area;
    }
}