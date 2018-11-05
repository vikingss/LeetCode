package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:24 2018/11/5
 * @Modified By:
 */
public class No151 {
    public static String reverseWords(String s) {
        if (s == null) return null;
        char[] a = s.toCharArray();
        int n = a.length;
        reverse(a, 0, n - 1);
        reverseWords(a, n);
        return cleanSpaces(a, n);
    }

    private static String cleanSpaces(char[] a, int n) {
        int i = 0,j = 0;
        while(j < n){
            while(j < n && a[j] == ' ' ) j++;
            while(j < n && a[j] != ' ') a[i++] = a[j++];
            while(j < n && a[j] == ' ') j++;
            if(j < n) a[i++] = ' ';
        }
        return new String(a).substring(0,i);
    }

    private static void reverseWords(char[] a, int n) {
        int i = 0,j = 0;
        while(i < n){
            while(i < j || i < n && a[i] == ' ') i++;
            while(j < i || j < n && a[j] != ' ') j++;
            reverse(a,i,j-1);
        }
    }

    private static void reverse(char[] a, int start, int end) {
        while (start < end) {
            char ch = a[start];
            a[start++] = a[end];
            a[end--] = ch;
        }
    }

}
