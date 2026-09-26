class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new LinkedHashSet<>();
        Arrays.sort(nums);
        int subset = (1 << nums.length);
        for (int num = 0; num < subset; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        return new ArrayList<>(ans);
    }
}