package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:42 2018/7/13
 * @Modified By:
 */
public class firstLevel102 {


    public static boolean buddyStrings(String A, String B) {
        if(A.length() == 0 && B.length() == 0){
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray()) s.add(c);
            return s.size() < A.length();
        } else {
            char[] cha = A.toCharArray();
            char[] chb = B.toCharArray();
            List<Integer> dif = new ArrayList<>();
            for (int i = 0; i < cha.length; ++i) {
                if (cha[i] != chb[i]) {
                    dif.add(i);
                }
            }
            return dif.size() == 2 && cha[dif.get(0)] == chb[dif.get(1)] && cha[dif.get(1)] == chb[dif.get(0)];
        }

    }

    public static void main(String[] args) {
        String A = "";
        String B = "";

        System.out.println(buddyStrings(A, B));

    }
}
