package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:45 2018/10/31
 * @Modified By:
 */
public class No88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,pos = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]) {
                nums1[pos--] = nums1[i--];
            }else if(nums1[i] < nums2[j]){
                nums1[pos--] = nums2[j--];
            }
        }
        while(i >= 0) nums1[pos--] = nums1[i--];
        while(j >= 0) nums1[pos--] = nums2[j--];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for(int i = 0; i < nums1.length; ++i){
            System.out.println(nums1[i]);
        }
    }
}
