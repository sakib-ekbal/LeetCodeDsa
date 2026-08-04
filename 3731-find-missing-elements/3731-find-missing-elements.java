class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = nums[0];
        int min = nums[0];
        for(int num:nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        for(int i=min;i<=max;i++){
            boolean found = false;
            for(int num:nums){
                if(num == i){
                    found = true;
                    break;
                }
            }
            if(!found) ans.add(i);
        }
        return ans;
    }
}