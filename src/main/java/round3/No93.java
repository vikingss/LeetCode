package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:00 2018/11/1
 * @Modified By:
 */
public class No93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> resList = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return resList;
        }
        for (int i = 1; i < 4 && i < s.length() - 2; ++i) {
            for (int j = i + 1; j < i + 4 && j < s.length() - 1; ++j) {
                for (int k = j + 1; k < j + 4 && k < s.length(); ++k) {
                    String s1 = s.substring(0, i), s2 = s.substring(i, j),
                        s3 = s.substring(j, k), s4 = s.substring(k, s.length());
                    if (valid(s1) && valid(s2) && valid(s3) && valid(s4)) {
                        resList.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return resList;
    }

    private boolean valid(String s1) {
        if (s1 == null || s1.length() == 0 || s1.length() > 3 || Integer.valueOf(s1) > 255
            || (s1.charAt(0) == '0' && s1.length() > 1)) {
            return false;
        }
        return true;
    }
}
