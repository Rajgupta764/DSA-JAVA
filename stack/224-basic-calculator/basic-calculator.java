class Solution {
    public int calculate(String s) {
        int n=s.length();
        int number=0;
        int result=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');  //convert kro character ko digit me and then wo number ban jayga
            }
            else if(ch=='+'){
                 result+=number*sign;
                 number=0;
                 sign=1;
            }
            else if(ch=='-'){
                   result+=number*sign;
                   number=0;
                   sign=-1;
            }
            else if(ch=='('){
                  st.push(result);
                  st.push(sign);
                  result=0;
                  sign=1;
            }
            else if(ch==')'){
                 result+=(number*sign);
                 number=0;
                 int st_sign=st.pop(); 
                 int st_result=st.pop();

                 result=st_result+(st_sign*result);
            }
            else if(ch==' '){
                continue;
            }
        }
        return result+number*sign;
    }
}
