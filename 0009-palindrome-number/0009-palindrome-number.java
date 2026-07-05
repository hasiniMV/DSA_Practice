class Solution {
    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        int l = sx.length() - 1;
        int s = 0, e = l;
        while (s < e) {
            if (!(sx.charAt(s) == sx.charAt(e))) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

}