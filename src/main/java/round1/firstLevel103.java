package round1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:55 2018/7/13
 * @Modified By:
 */
public class firstLevel103 {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while(x > 0){
            list.add(x % 10);
            x /= 10;
        }
        int i = 0,j = list.size() -1;
        while (i < j){
            if(list.get(i) != list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 12;
        System.out.println(isPalindrome(a));
    }
}
