class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(result);
                result=new StringBuilder();
            }
            else if(ch==')'){
                result.reverse();
                result=st.pop().append(result);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}