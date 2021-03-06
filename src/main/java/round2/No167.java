package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:29 2018/10/23
 * @Modified By:
 */
public class No167 {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0 || target < numbers[0]) {
            return null;
        }
        int[] res = new int[2];
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] > target) {
                return res;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            }
        }
        return res;
    }
}
