class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i , j , result;
        for (i = 0 ; i < nums.length ; i++)
        {
            for(j = i+1 ;j <nums.length ; j ++)
            {
                result = nums[i] + nums[j];
                if ( result == target )
                {
                    return new int [] {i ,j};
                }
            }
        }
        return new int[]{};

    }
}