package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:36 2018/10/29
 * @Modified By:
 */
public class No28 {
    //kmp
    public int strStr(String haystack, String needle) {
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

    private int[] kmpNext(String target) {
        int[] next = new int[target.length()];
        next[0] = 0;
        for(int i = 1,j=0; i < target.length();  ++i){
            while( j > 0 && target.charAt(i) != target.charAt(j)){
                j = next[j-1];
            }
            if(target.charAt(i) == target.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
