package round1;

/**
 */
public class firstLevel100 {
    public int peakIndexInMountainArray(int[] A) {
        //1 寻找最大的值
        int increasePos = -1;
        for (int i = 0; i < A.length; i++) {
            if(increasePos == -1 || A[i] > A[increasePos] ){
                increasePos = i;
            }
        }
        return increasePos;
    }
}
