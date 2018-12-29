package round1;

/**

 给定一个整数，将其转化为7进制，并以字符串形式输出。

 示例 1:

 输入: 100
 输出: "202"
 示例 2:

 输入: -7
 输出: "-10"
 注意: 输入范围是 [-1e7, 1e7] 。
 */
public class firstLevel63 {
    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int tmp = num;
        while(Math.abs(tmp) > 0){
            sb.append(Math.abs(tmp % 7));
            tmp /= 7;
        }
        if(num < 0){
            sb.append('-');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(firstLevel63.convertToBase7(num));
    }
}
