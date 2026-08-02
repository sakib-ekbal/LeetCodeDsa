class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int EvenCount = 0;
            int OddCount = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2 == 0) EvenCount++;
                else OddCount++;
                if(OddCount>0 && EvenCount*b <= OddCount*a) count++;
            }
        }
        return count;
    }
}