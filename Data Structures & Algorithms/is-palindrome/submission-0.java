class Solution {
    public boolean isPalindrome(String s) {
        String S=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String newS= "";
        for(int i=S.length()-1;i>=0;i--){
            newS += S.charAt(i);
        }
        if(S.equals(newS)){
            return true;
        }
        return false;
        
    }
}
