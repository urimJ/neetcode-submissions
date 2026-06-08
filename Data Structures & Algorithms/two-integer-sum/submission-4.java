class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i <nums.length) {
            int find = target - nums[i];
            Map<Integer, Integer> hm = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                hm.put(nums[j], j);
            }
            if (hm.containsKey(find)) {     // boolean
                return new int[]{i, hm.get(find)};
            }
            i++;
        }
        return new int[]{};
    }
}
