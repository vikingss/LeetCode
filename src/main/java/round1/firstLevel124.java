package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is: [ [-1,  0, 0, 1], [-2, -1, 1, 2], [-2,  0, 0, 2] ]
 */
public class firstLevel124 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length < 4) {
            return resList;
        }
        for (int i = 0; i < nums.length - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1, r = nums.length - 1, find = target - (nums[i] + nums[j]);
                while (l < r) {
                    if (nums[l] + nums[r] == find) {
                        resList.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    } else if (nums[l] + nums[r] < find) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
