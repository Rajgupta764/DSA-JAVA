class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int start=0;
        int end=n-1;
        while((end-start+1)>k){
            if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x)){
                start++;
            }
            else {
                end--;
            }
        }
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}