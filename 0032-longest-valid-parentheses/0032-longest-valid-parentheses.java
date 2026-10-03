class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> idx = new Stack<>();
        idx.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                idx.push(i);
            } else {
                idx.pop();
                if (idx.isEmpty()) {
                    idx.push(i);
                } else {
                    int length = i - idx.peek();
                    maxLength = Math.max(length, maxLength);
                }
            }
        }
        return maxLength;
    }
}