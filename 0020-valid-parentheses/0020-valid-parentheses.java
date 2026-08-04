class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()==true || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else if(st.isEmpty()==false && (s.charAt(i) == ')' && st.peek() == '(' ||
                    s.charAt(i) == ']' && st.peek() == '[' ||
                    s.charAt(i) == '}' && st.peek() == '{')) st.pop();
            else return false;
        }
        if (st.isEmpty() == true) return true;
        return false;
    }
}