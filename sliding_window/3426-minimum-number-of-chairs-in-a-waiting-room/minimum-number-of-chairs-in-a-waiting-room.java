class Solution {
    public int minimumChairs(String s) {
        s=s.trim();
        char[] ch=s.toCharArray();
        int n=ch.length;
        if(n==1){
            if(ch[0]=='E'){
                return 1;
            }
            else {
                return 0;
            }
        }
        int count=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='E'){
                c++;
            }
            else {
                c-=1;
            }
            if(c>count){
                count=c;
            }
        }
       
        return count;
    }
}