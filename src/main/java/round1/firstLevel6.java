package round1;

import java.util.HashMap;
import java.util.Map;

/**
 给定两个数组，写一个方法来计算它们的交集。

 例如:
 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].

 注意：

 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 我们可以不考虑输出结果的顺序。
 跟进:

 如果给定的数组已经排好序呢？你将如何优化你的算法？
 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class firstLevel6 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] result = {0};
        int pos = 0;
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        if(nums1.length == 0 || nums2.length == 0){
            return result;
        }
        for(int i = 0; i <  nums1.length; ++i){
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }

        for(int i = 0; i < nums2.length; ++i){
            if(map1.containsKey(nums2[i])){
                map1.put(nums2[i],map1.get(nums2[i]) - 1);
                result[pos++] = nums2[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,2};
        System.out.println(firstLevel6.intersect(nums1,nums2));
    }

}
