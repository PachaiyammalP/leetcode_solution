class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int div=1;
        int sum=0;
        while(div<=n){
            int ld=n%(div*10)/div;
            sum=sum+ld;
            div=div*10;
        }
        if(n%sum==0) return sum;
        return-1;
    }
}