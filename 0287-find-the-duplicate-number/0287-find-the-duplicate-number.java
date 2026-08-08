class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       int j=i+1;
       for(;i<nums.length;i++){
        if(nums[i] == nums[j]) return nums[i];
        else{
            j++;
        }
    }
    return -1;
    }
}