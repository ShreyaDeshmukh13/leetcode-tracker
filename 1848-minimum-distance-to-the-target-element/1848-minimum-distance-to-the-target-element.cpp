class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        
        int minDist = nums.size();

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == target) {
                int distance = abs(i - start);
                minDist = min(minDist, distance);
            }
        }

        return minDist;
    }
};