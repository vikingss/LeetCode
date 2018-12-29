package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:15 2018/9/29
 * @Modified By:
 */
public class firstLevel155 {
    public int compareVersion(String version1, String version2) {
        String[] level1 = version1.split("\\.");
        String[] level2 = version2.split("\\.");
        int length = Math.max(level1.length,level2.length);
        for(int i = 0; i < length; ++i){
            Integer v1 = i < level1.length ? Integer.valueOf(level1[i]) : 0;
            Integer v2 = i < level2.length ? Integer.valueOf(level2[i]) : 0;
            int compare = v1.compareTo(v2);
            if(compare != 0){
                return compare;
            }
        }
        return 0;
    }
}
