class Solution {
    public int findGCD(int[] nums) {
      int min=nums[0],max=nums[0];
      for(int n:nums){
        if(n<min) min=n;
        if(n>max) max=n;
      }
      while(max%min!=0){
        int t=max%min;
        max=min;
        min=t;
      } 
      return min; 
    }
}