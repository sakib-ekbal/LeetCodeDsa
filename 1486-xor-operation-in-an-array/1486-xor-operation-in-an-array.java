class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}