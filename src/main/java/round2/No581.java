package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:51 2018/10/25
 * @Modified By:
 */
public class No581 {

    public static int findUnsortedSubarray(int[] A) {
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max) end = i;
            if (A[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }


    public static void main(String[] args) {
        int[] nums = {2, 6, 4,7,8,3,1 };
        System.out.println(findUnsortedSubarray(nums));
    }

}
