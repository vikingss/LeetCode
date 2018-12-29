package round1;

/**
 给定两个二进制字符串，返回他们的和（用二进制表示）。

 输入为非空字符串且只包含数字 1 和 0。

 示例 1:

 输入: a = "11", b = "1"
 输出: "100"
 示例 2:

 输入: a = "1010", b = "1011"
 输出: "10101
 */
public class firstLevel47 {
    public static String addBinary(String a, String b) {
        String res = "";
        int carry = 0;
        int i = a.length() - 1,j = b.length() - 1;
        while(i >= 0 && j >= 0){
            int sum = a.charAt(i) - '0' + b.charAt(j) - '0'+ carry;
            carry = sum / 2 ;
            sum %= 2;
            res += sum;
            i--;
            j--;
        }
        while(i >= 0){
            int sum = a.charAt(i) - '0' + carry;
            carry= sum /2;
            sum %= 2;
            res += sum;
            i--;
        }
        while(j >= 0){
            int sum = b.charAt(j) - '0' + carry;
            carry= sum /2;
            sum %= 2;
            res += sum;
            j--;
        }
        if(carry != 0){
            res += carry;
        }
        StringBuilder sb = new StringBuilder();

        for(int p = res.length() - 1; p >=0; p--){
            sb.append(res.charAt(p));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "11",str2 = "1";
        System.out.println(firstLevel47.addBinary(str1,str2));
    }
}
