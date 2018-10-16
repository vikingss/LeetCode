package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:51 2018/10/16
 * @Modified By:
 */
public class No87 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,cur =  m+n-1;
        while(i >= 0 && j >= 0)nums1[cur--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        while(i >= 0) nums1[cur--] = nums1[i--];
        while(j >= 0) nums1[cur--] = nums2[j--];
    }
}
