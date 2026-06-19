class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while(l<=r){
            int index = (l+r)/2;

            if(nums[index] < target){
                l = index+1;
            }else if(nums[index]>target){
                r = index-1;
            }else{
                return index;
            }
        }
        return l;
    }
}