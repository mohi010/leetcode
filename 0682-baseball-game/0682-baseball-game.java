class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>  ans = new Stack<>();
        for (int i =0;  i<operations.length; i++){
            String s = operations[i];
            if (s.equals("C")){
                ans.pop();
            }
            else if (s.equals("D")){
                int top = ans.peek();
                ans.push(top*2);
            }
            else if (s.equals("+")){
                int top1 = ans.pop();
                int top2 = ans.peek();
                ans.push(top1);
                ans.push(top1+top2);
            }
            else{
                int num = Integer.parseInt(s);
                ans.push(num);
            }
        }
        int sum = 0;
        while(ans.size()!=0){
            sum+=ans.pop();
        }
        return sum;
    }
}