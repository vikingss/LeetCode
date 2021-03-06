package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:23 2018/10/9
 * @Modified By:
 */
public class No27 {
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(haystack.length() < needle.length() || haystack.length() == 0) return -1;
        int[] next = kmpNext(needle);
        for(int i = 0,j = 0; i < haystack.length(); ++i){
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j-1];
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
}
