package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:30 2019/1/24
 * @Modified By:
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length <= 1) return 0;
        int l = 0,h = height.length - 1;
        int res = Integer.MIN_VALUE;
        while(l < h){
            int tmp = Math.min(height[l],height[h]) * (h - l);
            res = res < tmp ? tmp : res;
            if(height[l] < height[h]) l++; //想清楚下一步为什么是这样的？（因为面积是乘积，只找比现在这两个数大的）
            else h--;
        }
        return res;

    }
}
