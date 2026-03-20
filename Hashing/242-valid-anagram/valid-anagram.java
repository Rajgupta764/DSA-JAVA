class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1=new String(arr1);
        String s2=new String(arr2);
        if(s1.equals(s2)){
            return true;
        }
        return false;

    }
}