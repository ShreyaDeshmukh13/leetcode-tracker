class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length ; 
        int [] ans = new int[n] ;
        int m = nums.length ;
        for(int i = 0 ; i < ans.length ; i++)
        {
            if(i < m)
            {
                ans[i] = nums[i] ;
            }   
            else
            {
                ans[i] = nums[i - m];
            }
        }
    return ans;
    }
}