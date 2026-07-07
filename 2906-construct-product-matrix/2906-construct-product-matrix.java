class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345, m = grid.length, n = grid[0].length, k = 0;
        int[] a = new int[m * n];
        for (int[] r : grid)
            for (int x : r)
                a[k++] = x % mod;

        long[] pre = new long[k], suf = new long[k];
        pre[0] = suf[k - 1] = 1;

        for (int i = 1; i < k; i++)
            pre[i] = pre[i - 1] * a[i - 1] % mod;

        for (int i = k - 2; i >= 0; i--)
            suf[i] = suf[i + 1] * a[i + 1] % mod;

        k = 0;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                ans[i][j] = (int) (pre[k] * suf[k++] % mod);

        return ans;
    }
}
    
