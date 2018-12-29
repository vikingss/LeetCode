package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 19:20 2018/6/30
 * @Modified By:
 */
public class firstLevel75 {
    public static int hammingDistance(int x, int y) {
        int cnt = 0;
        while(x != 0 || y != 0){
            if((x ^ y) % 2 == 1){
                cnt++;
            }
            x = x>>>1;
            y = y>>>1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s;

        int x = 1,y = 6;
        System.out.println(firstLevel75.hammingDistance(x,y));
    }
}
