class Solution {
    public String removeDigit(String number, char digit) {
        String max="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String current=number.substring(0,i)+number.substring(i+1);

                if(max.equals("") || current.compareTo(max)>0){
                    max=current;
                }
            }
        }
        return max;
    }
}