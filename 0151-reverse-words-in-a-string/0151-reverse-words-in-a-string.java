class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int j = s.length() - 1;
        while (j >= 0) {
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            if (j < 0) {
                break;
            }
            int i = j;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (ans.length() > 0)
                ans.append(' ');
            ans.append(s.substring(i + 1, j + 1));
            j = i;
        }
        return ans.toString();
    }
}