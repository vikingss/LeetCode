package round1;

/**
 Implement strStr().

 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Example 1:

 Input: haystack = "hello", needle = "ll"
 Output: 2
 Example 2:

 Input: haystack = "aaaaa", needle = "bba"
 Output: -1
 Clarification:

 What should we return when needle is an empty string? This is a great question to ask during an interview.

 For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class firstLevel106 {
    public static int strStr(String haystack, String needle) {
        if( haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        if(haystack.length() != 0 && needle.length() == 0){
            return 0;
        }
        if(haystack.length() < needle.length() || haystack.length() == 0){
            return -1;
        }


        int[] next = kmpNext(needle);
        for(int i = 0,j = 0; i < haystack.length(); ++i){
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j - 1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i - j + 1;
            }
        }
        return -1;
    }

    private static int[] kmpNext(String needle) {
        int[] next = new int[needle.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < needle.length(); ++i){
            while(j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void main(String[] args) {
        String str ="abababcab";
        String tar = "abc";
        System.out.println(strStr(str,tar));
    }
}
