class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int numsLength=nums.length;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }
            }
        }
        return ans;
        
    }
}