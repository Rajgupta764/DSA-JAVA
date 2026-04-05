class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            int current=asteroids[i];
            while(!st.isEmpty() && current<0 && st.peek()>0){
                int sum=current+st.peek();
                if(sum<0){
                    st.pop();
                }
                else if(sum>0){
                    current=0;
                }
                else {
                    st.pop();
                    current=0;
                }
            }
            if(current!=0){
                st.push(current);
            }
        }
        int result[]=new int[st.size()];
         int j=0;
         for(int s:st){
            result[j++]=s;
         }
        return result;
    }
}