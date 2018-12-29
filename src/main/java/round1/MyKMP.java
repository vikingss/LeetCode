package round1;

import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:25 2018/7/12
 * @Modified By:
 */
public class MyKMP {
    public static int kmp(String str,String target){
        int[] next = kmpNext(target);
        for(int i = 0,j=0; i < str.length(); ++i){
            while(j > 0 && str.charAt(i) != target.charAt(j)){
                j = next[j-1];
            }
            if(str.charAt(i) == target.charAt(j)){
                j++;
            }
            if(j == target.length()){
                return i - j + 1;
            }
        }
        return 0;
    }

    private static int[] kmpNext(String target) {
        int[] next = new int[target.length()];
        for(int i = 1,j = 0; i < target.length(); ++i){
            while(j > 0 && target.charAt(i) != target.charAt(j)){
                j = next[j-1];
            }
            if(target.charAt(i) == target.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        System.out.println(Arrays.toString(next));
        return next;
    }

    public static void main(String[] args) {
        String str = "abaeabadsababh";
        String target = "abab";
        System.out.println(kmp(str,target));
    }
}
