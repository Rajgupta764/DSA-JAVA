class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int start=0;
        int end=n-1;
        while(start<=end){
            int length=end-start;
            int breadth=Math.min(height[start],height[end]);
            max=Math.max(max,length*breadth);
            


            if(height[start]<height[end]){
                start++;
            }
            else {
                end--;
            }
        }
        return max;
    }
}