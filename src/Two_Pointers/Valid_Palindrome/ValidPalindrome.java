package Two_Pointers.Valid_Palindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            sb.append(Character.toLowerCase(c));
        }
        int n = sb.length();

        int i=0;
        int j = n-1;
        while(i<j){
            if(sb.charAt(i++) != sb.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
