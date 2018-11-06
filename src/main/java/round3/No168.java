package round3;


/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:58 2018/11/6
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
        int n = 52;
        System.out.println(convertToTitle(n));
    }
}
