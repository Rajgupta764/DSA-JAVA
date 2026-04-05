class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentmass=mass;
        for(int val:asteroids){
            if(currentmass<val){
                return false;
            }
            currentmass+=val;
        }
        return true;
    }
}