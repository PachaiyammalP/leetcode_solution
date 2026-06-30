class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int n:nums){
        esum+=n;
        int temp=n;
        while(temp>0){
            dsum+=temp%10;
            temp/=10;
        }
        }
        if(esum>dsum)
          return esum-dsum;
        else
          return dsum-esum;
      
    }
}