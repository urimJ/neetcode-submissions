class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (hm.containsKey(find)) { // boolean
                return new int[]{hm.get(find), i};
            }
            hm.put(nums[i], i);  // 찾은 후에 추가 (중복 방지)
        }
        return new int[]{};
    }
}
