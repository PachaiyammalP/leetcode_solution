class Solution {
    public int[] plusOne(int[] A) {
        for(int i=A.length-1;i>=0;i--){
            if(A[i]!=9){
               A[i]=A[i]+1;
                return A;  
            } 
             A[i]=0; 
        }
         int ans[]=new int[A.length+1];
         ans[0]=1;
         return ans;
    }
}
