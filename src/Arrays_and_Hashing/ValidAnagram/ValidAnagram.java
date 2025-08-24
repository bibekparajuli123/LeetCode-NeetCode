package Arrays_and_Hashing.ValidAnagram;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr = new int[26];

        //Add al s elements to arr
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }

        //Subtract s elements using t
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']--;

            if(arr[s.charAt(i)-'a']<0){
                return false;
            }
        }
        return false;
    }
}
