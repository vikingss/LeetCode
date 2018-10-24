package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:40 2018/10/23
 * @Modified By:
 */
public class No168 {
    public static String convertToTitle(int n) {
        if(n <= 0) return null;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            sb.insert(0,(char)('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}
