class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> um;
        vector<int> vec;
        int num;
        
        // 숫자를 키로, 인덱스를 값으로 저장
        for (int i = 0; i < nums.size(); i++) {
            num = nums[i];
            um[num] = i;
        }
        
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            
            // `complement`가 `nums`에 있고, 인덱스가 다를 때
            if (um.find(complement) != um.end() && um[complement] != i) {
                vec.push_back(i);
                vec.push_back(um[complement]);
                return vec;
            }
        }
        return vec; // 해결책이 없는 경우 빈 벡터 반환
    }
};
