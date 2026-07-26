class Solution {
    public String convertToTitle(int c) {
        StringBuilder result = new StringBuilder();
        
        while (c > 0) {
            c--; 
            char d = (char) ('A' + (c % 26));
            result.append(d);
            c /= 26;
        }
        
        return result.reverse().toString();
    }
}