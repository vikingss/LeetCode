package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:26 2018/10/13
 * @Modified By:
 */
public class No60 {
    public static String getPermutation(int n, int k) {
        int sum = 1;
        for(int i = n; i > 0 ; --i){
            sum *= i;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder dic = new StringBuilder();
        for(int i = 1; i <= n; ++i){
            dic.append(i);
        }
        int num = k;
        for(int i = n; i > 0; i--){
            sum /= i;
            int index = (num-1)/sum;
            sb.append(dic.charAt(index));
            dic.deleteCharAt(index);
            num -= index * sum;
        }
        return sb.toString();
    }
}
