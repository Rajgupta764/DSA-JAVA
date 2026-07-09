class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            int width=right-left;
            int length=Math.min(height[left],height[right]);
            area=Math.max(area,length*width);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return area;
    }
}