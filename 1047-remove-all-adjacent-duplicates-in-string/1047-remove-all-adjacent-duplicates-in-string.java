class Solution {
    public String removeDuplicates(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (st.isEmpty()==true || st.peek()!=ch) st.push(ch);
            else{
                st.pop();
            }
        }
        // if (st.isEmpty()) return ans;
        while(st.size()!=0){
            char top = st.pop();
            st2.push(top);
        }
        while(st2.size()!=0){
            char top = st2.pop();
            ans+=top;
            st.push(top);
        }
        return ans;
    }
}