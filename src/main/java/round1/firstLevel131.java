package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:26 2018/8/2
 * @Modified By:
 */
public class firstLevel131 {
    //第k个n=3序列前面有k-1个序列
    //第K个n=3序列的第index个数位于 (k - 1) / n！位;

    public static String getPermutation(int n, int k) {
        int sum = 1;
        for(int i = n; i > 0; --i){
            sum *= i;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder dic = new StringBuilder();
        for(int i = 1; i <=n; ++i){
            dic.append(i);
        }
        int num = k;
        for(int i = n; i > 0; i--){
            sum /= i;
            int index = (num - 1) / sum ;
            sb.append(dic.charAt(index));
            dic.deleteCharAt(index);
            num -= index * sum;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 3,k =3;
        System.out.println(getPermutation(n,k));
    }
}
