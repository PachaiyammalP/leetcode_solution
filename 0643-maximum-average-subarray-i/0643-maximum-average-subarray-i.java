class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        int sum = 0;
        double maxSum;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxSum = (double) sum / k;

        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, (double) sum / k);
        }

        return maxSum;
    }
}
    
