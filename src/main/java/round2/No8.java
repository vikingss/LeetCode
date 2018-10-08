package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:35 2018/10/7
 * @Modified By:
 */
public class No8 {

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        int sign = 1;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); ++i) {
            if (i == 0) {
                if (str.charAt(i) == '+') {
                    sign = 1;
                } else if (str.charAt(i) == '-') {
                    sign = -1;
                } else if (!Character.isDigit(str.charAt(0))) {
                    return 0;
                } else {
                    sb.append(str.charAt(i));
//                    result = str.charAt(i) - '0';
                }
            } else if (Character.isDigit(str.charAt(i))) {
//                result = result * 10 + (str.charAt(i) - '0') * sign;
//                System.out.println(result);
                sb.append(str.charAt(i));
            } else {
                break;
            }
        }
        long result = 0;
        for(int i = 0;i < sb.length(); ++i) {
                result = result * 10 + (sb.charAt(i) - '0') * sign;
            if (result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) result;

    }

    public static void main(String[] args) {
        String a = "9223372036854775808";
        System.out.println("result:" + myAtoi(a));
    }
}
