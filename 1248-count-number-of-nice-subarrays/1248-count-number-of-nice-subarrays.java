class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
    private int atMost(int[] nums,int k){
         if(k<0) return 0;
        int low = 0;
        int high = 0;
        int sum = 0;
        int count = 0;
        while(high<nums.length){
            sum = sum+(nums[high]%2);
            while(sum>k){
                sum = sum - (nums[low]%2);
                low++;
            }
            count = count+(high-low+1);
            high++;
        }
        return count;
    }
}