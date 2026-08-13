class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubleDigit = 0;

        for (int x : nums) {
            if (x < 10) {
                single += x;
            } else {
                doubleDigit += x;
            }
        }

        return single > doubleDigit || doubleDigit > single;
    }
}