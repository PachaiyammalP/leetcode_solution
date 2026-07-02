class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        long sum=0,max=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
            if(i>=k){
                sum-=nums[i-k];
                h1.put(nums[i-k],h1.get(nums[i-k])-1);
                if(h1.get(nums[i-k])==0)
                h1.remove(nums[i-k]);
            }
            if(i>=k-1&&h1.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}