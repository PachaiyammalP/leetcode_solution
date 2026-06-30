class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(char c:s.toCharArray()){
            int n=c-'a'+1;
            sum+=n/10+n%10;
        }
        while(--k>0){
            int t=0;
            while(sum>0){
                t+=sum%10;
                sum/=10;
            }
            sum=t;
        }
        return sum;
         
    }
}