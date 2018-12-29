package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:33 2018/7/12
 * @Modified By:
 */
public class MyTopK {

    public static void main(String[] args) {
        int[] a = { 1, 17, 3, 4, 5, 6, 7, 16, 9, 10, 11, 12, 13, 14,0, 15, 8 };
        int[] b = topK(a, 4);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
    public static int[] topK(int[] nums,int k){
        int[] newNums = new int[k];
        for(int i = 0; i < k; ++i){
            newNums[i] = nums[i];
        }
        //构建
        myBuildHeap(newNums);

        for(int i = k; i <  nums.length;  ++i){
            //调整
            if (nums[i] < newNums[0]) {
                newNums[0] = nums[i];
                myHeapify(newNums, 0, newNums.length);
            }
        }

        return newNums;
    }

    private static void myHeapify(int[] newNums, int index, int length) {
        int leftPos = 2 * index + 1;
        int rightPos = 2 * index + 2;
        int maxPos = index;
        if(leftPos < length && newNums[leftPos] > newNums[index]){
            maxPos = leftPos;
        }
        if(rightPos < length && newNums[rightPos] > newNums[maxPos]){
            maxPos = rightPos;
        }
        if(maxPos != index){
            int tmp = newNums[index];
            newNums[index] = newNums[maxPos];
            newNums[maxPos] = tmp;
            myHeapify(newNums,maxPos,length);
        }
    }

    private static void myBuildHeap(int[] newNums) {
       for(int i = newNums.length / 2 -1; i >= 0;  i--){
           myHeapify(newNums,i,newNums.length);
       }
    }





}
