package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:33 2018/11/6
 * @Modified By:
 */
public class No165 {
    public int compareVersion(String version1, String version2) {
        String[] level1 = version1.split("\\.");
        String[] level2 = version2.split("\\.");
        int length = version1.length() > version2.length() ? version1.length():version2.length();
        for(int i = 0; i < length; ++i){
            Integer a = i < level1.length ? Integer.valueOf(level1[i]) : 0;
            Integer b = i < level2.length ? Integer.valueOf(level2[i]) : 0;
            int compare = a.compareTo(b);
            if(compare != 0) return compare;
        }
        return 0;
    }
}
