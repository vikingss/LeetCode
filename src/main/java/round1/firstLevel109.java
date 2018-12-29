package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:02 2018/7/16
 * @Modified By:
 */
public class firstLevel109 {

    public static String multiply(String num1, String num2) {

        int[] index = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int tmp = mul + index[i + j + 1];

                index[i + j + 1] = tmp % 10;

                index[i + j] += tmp / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index.length; ++i) {
            if (!(sb.length() == 0 && index[i] == 0)) {
                sb.append(index[i]);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "1232345", num2 = "45234567";
        System.out.println(multiply(num1, num2));
    }
}
