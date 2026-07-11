class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int  numsLength=nums.length;
        Stack<Integer> s1=new Stack<>();
        int index=numsLength-1;
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!s1.isEmpty()&&nums[i]>=nums[s1.peek()]){
                s1.pop();
            }
            int topElement=s1.isEmpty()==true?0:Math.abs(i-s1.peek());
            ans[index--]=topElement;
            s1.push(i);

        }
        return ans;
        
    }
}