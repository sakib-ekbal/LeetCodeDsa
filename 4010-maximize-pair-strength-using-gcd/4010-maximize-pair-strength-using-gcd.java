class Solution {
    public long gcd(long max , long sec_max){
        if(sec_max == 0){
            return max;
        }else{
            return gcd(sec_max,max%sec_max);
        }
    }
    public long maxPairStrength(int[] nums) {
        long ans = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g = gcd(nums[i],nums[j]);
                long strength = (nums[i]/g)*(nums[j]/g);
                ans = Math.max(ans,strength);
            }
        }
        return ans;
    }
}