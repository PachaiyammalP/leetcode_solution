class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            boolean first=false;
            boolean second=false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==diff)
                first=true;
                if(nums[j]-nums[i]==2*diff)
                second=true;
            }
            if(first&&second)
            count++;
        }
        return count;
    }
}