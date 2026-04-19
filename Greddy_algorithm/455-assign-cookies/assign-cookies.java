class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cokkies=0;
        while(child<n && cokkies<m){
            if(s[cokkies]>=g[child]){
                child++;
            }
            cokkies++;
        }
        return child;
    }
}