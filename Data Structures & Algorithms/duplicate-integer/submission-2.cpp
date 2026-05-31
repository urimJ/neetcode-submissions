
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, bool> um;
        for(int i=0; i<nums.size(); i++)
        {
            um[nums[i]] = true;
        }
        if(um.size()==nums.size())
        {
            return false;
        } else
        {
            return true;
        }
    }
};
