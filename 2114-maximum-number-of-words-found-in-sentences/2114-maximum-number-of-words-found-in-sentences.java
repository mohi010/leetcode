class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int words = 1; // At least one word
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }
            max = Math.max(max, words);
        }

        return max;
    }
}