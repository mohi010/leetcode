class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans  = new ArrayList<>();
        for (int i = 0; i<words.length; i++){
            if (find(words[i], x)) ans.add(i); 
        }
        return ans;
    }
    public static boolean find(String words , char x){
        for (int i = 0; i<words.length(); i++){
            if ((char)words.charAt(i)==x) return true;
        }
        return false;
    }
}