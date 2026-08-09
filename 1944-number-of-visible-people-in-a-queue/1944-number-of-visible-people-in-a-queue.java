class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n  = heights.length;
        if (n==1) return new int[]{0};
        int[] ans = new int[n];
        ans[n-1] = 0;
        Stack<Integer> st = new Stack<>();
        st.push(heights[n-1]);
        for (int i = n-2; i>=0; i--){
            int cnt = 0;
            while(st.size()>0 && heights[i]>=st.peek()){
                cnt++;
                st.pop();
            }
            if (st.size()==0) st.push(heights[i]);
            else {
                cnt++;
                st.push(heights[i]);
            }
            ans[i] = cnt;
        }
        return ans;
    }
}