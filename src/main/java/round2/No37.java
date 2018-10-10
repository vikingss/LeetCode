package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:23 2018/10/9
 * @Modified By:
 */
public class No37 {
    public static String countAndSay(int n) {
        if(n == 0) return "";
        if(n == 1) return "1";
        String str = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            char ch = str.charAt(i);
            int count = commonCnt(ch,i,str);
            sb.append(count).append(ch);
            i +=  count;
        }
        return sb.toString();
    }

    private static int commonCnt(char ch, int pos, String str) {
        int res = 0;
        for(int i = pos; i < str.length(); ++i){
            if(str.charAt(i) == ch) res++;
            else break;
        }
        return res;
    }
     public static void main(String[] args){
         System.out.println(countAndSay(4));
     }
}
