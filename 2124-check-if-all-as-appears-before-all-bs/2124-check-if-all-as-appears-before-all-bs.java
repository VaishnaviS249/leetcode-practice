class Solution {
    public boolean checkString(String s) {
        boolean fb=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                fb=true;
            }
            if(s.charAt(i)=='a' && fb){
                return false;
            }
        }
        return true;
    }
}