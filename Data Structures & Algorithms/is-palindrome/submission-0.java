class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0; 
        int j = s.length()-1;
        while(i<j){
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));
            if(Character.isLetterOrDigit(ch1)==false){
                i++;
                continue ;
            }
            else if(Character.isLetterOrDigit(ch2)== false){
                j--;
                continue ;
            }
            else if(ch1 != ch2){
                return false;
            }
            else{ 
                i++;
                j--;
            }
        }
       return true ;
    }
}
