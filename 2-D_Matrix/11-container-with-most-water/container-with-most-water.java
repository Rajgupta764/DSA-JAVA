class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<=end){
            int length=end-start;
            int width=Math.min(height[start],height[end]);
            max=Math.max(max,length*width);
            if(height[start]<height[end]){
                start++;
            }
           else if(height[start]>height[end]){
              end--;
           }
           else {
            start++;
            end--;
           }
        }
        return max;
    }
}