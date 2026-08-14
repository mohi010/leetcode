class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer >map = new HashMap<>();
        map.put(s.charAt(0), 1);
        int i =0;
        int maxLen = 1;
        for (int j =1; j<s.length(); j++){
            char ch = s.charAt(j);
            if (map.containsKey(ch)){
                if(map.get(ch)>1){
                    while(map.get(ch)>=2 && i<=j){
                        map.put(s.charAt(i), map.get(s.charAt(i))-1);
                        i++;
                    }
                }
                map.put(ch, map.get(ch)+1);
            }
            else map.put(ch, 1);
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}