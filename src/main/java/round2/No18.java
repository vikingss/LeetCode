package round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:25 2018/10/8
 * @Modified By:
 */
public class No18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        if (nums.length < 4) {
            return resList;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; ++j) {
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1, h = nums.length - 1, find = target - (nums[i] + nums[j]);
                while (l < h) {
                    if (nums[l] + nums[h] == find) {
                        resList.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));
                        l++;
                        h--;
                        while (l < h && nums[l] == nums[l - 1])
                            l++;
                        while (l < h && nums[h] == nums[h + 1])
                            h--;
                    } else if (nums[l] + nums[h] < find)
                        l++;
                    else
                        h--;
                }
            }

        }
        return resList;
    }
}
