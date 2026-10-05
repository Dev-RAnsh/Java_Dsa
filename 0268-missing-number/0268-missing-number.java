class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualsum = n*(n+1)/2; 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans = actualsum - sum;
        return ans;
    }
}
