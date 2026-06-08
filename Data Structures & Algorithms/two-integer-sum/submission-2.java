class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, idxI = 0, idxJ = 0;
        while(i <nums.length) {
            int find = target - nums[i];
            idxI = i;
            Map<Integer, Integer> hm = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                hm.put(nums[j], j);
            }
            if (hm.get(find) != null) {
                idxJ = hm.get(find);
                break;
            }
            i++;
        }
        return new int[]{idxI, idxJ};
    }
}
