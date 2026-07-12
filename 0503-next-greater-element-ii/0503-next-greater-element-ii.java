class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<2*n;i++){
            int in=(i%n);
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[in]){
                int j=stack.pop();
                ans[j]=nums[in];
                
            }
            if(i<n)stack.push(in);
        }
        return ans;

    }
}