class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
           if(ch=='*'){
              if(!st.isEmpty()){
                st.pop();
              }
           }
           else {
            st.push(ch);
           }
        }
        for(char ch:st){
            result.append(ch);
        }
        return result.toString();
    }
}