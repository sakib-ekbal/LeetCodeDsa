class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        /* int n1 = nums1.length;
        int n2=nums2.length;
        int[] nums3 = new int[n1*n2];
        int k=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                nums3[k] = nums1[i] ^ nums2[j];
                k++;
            }
        }
        int ans = 0;
        for(int i = 0;i<nums3.length;i++){
            ans^=nums3[i];
        }
        return ans;   */
        int ans = 0;
        if (nums2.length % 2 != 0) {
            for (int i = 0; i < nums1.length; i++) {
                ans ^= nums1[i];
            }
        }
        if (nums1.length % 2 != 0) {
            for (int i = 0; i < nums2.length; i++) {
                ans ^= nums2[i];
            }
        }
        return ans;
    }
}