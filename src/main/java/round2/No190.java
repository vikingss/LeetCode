package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:52 2018/10/24
 * @Modified By:
 */
public class No190 {
    public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; ++i){
            res += n & 1;
            n = n >>>1;
            if(i < 31) {
                res = res << 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(reverseBits(n));
    }
}
