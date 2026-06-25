class Solution {
    public int addDigits(int num) {
        int k = num;
        while(k>9){
                k=0;
            while(num!=0){
                int n = num%10;
                k+=n;
                num = num/10;
            }
            num = k;
        }
        return k;
    }
}