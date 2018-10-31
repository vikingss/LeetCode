package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:02 2018/10/31
 * @Modified By:
 */
public class No67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int curry = 0;
        while(i >= 0 || j >= 0){
            int sum = curry;
            if(j >= 0) sum += b.charAt(j--) - '0';
            if(i >= 0) sum += a.charAt(i--) - '0';
            sb.insert(0,sum % 2);
            curry = sum  / 2;
        }
        if(curry != 0) sb.insert(0,curry);
        return sb.toString();
    }
}
