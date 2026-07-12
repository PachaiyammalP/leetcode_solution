class Solution {
    public int trap(int[] height) {
       if(height.length == 0) return 0;
        
        int l = 0, r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int ans = 0;
        
        while(l < r) {
            if(maxL < maxR) {
                ans += maxL - height[l];
                l++;
                maxL = Math.max(maxL, height[l]);
            } else {
                ans += maxR - height[r];
                r--;
                maxR = Math.max(maxR, height[r]);
            }
        }
        return ans;
    }
}