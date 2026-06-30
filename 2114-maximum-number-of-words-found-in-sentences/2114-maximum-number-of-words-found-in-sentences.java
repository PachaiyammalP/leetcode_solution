class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(String str:s){
        String arr[]=str.split(" ");
        int len=arr.length;
        max=Math.max(max,len);

       }
     return max;
    }    
    
}