class Solution {
    public int reverse(int x) {
        long reverse=0;
        int sign=x<0?-1:1;
        long n=Math.abs((long)x);
        while(n>0){
            long remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        reverse=reverse*sign;
       if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
        return 0;
       }
       return (int)reverse;
    }
}