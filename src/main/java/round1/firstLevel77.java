package round1;

/**
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Note: For the purpose of this problem, we define empty string as valid palindrome.

 Example 1:

 Input: "A man, a plan, a canal: Panama"
 Output: true
 Example 2:

 Input: "race a car"
 Output: false
 */
public class firstLevel77 {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = s.toLowerCase();
        for(int i = 0; i < s1.length(); ++i){
            char c = s.toLowerCase().charAt(i);
            if( (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') ){
                sb.append(c);
            }
        }

        int i = 0,j = sb.length()-1;
        while (i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(firstLevel77.isPalindrome(str));
    }
}
