package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 22:59 2018/10/7
 * @Modified By:
 */
public class No11 {
    public int maxArea(int[] height) {
        int l = 0,h = height.length - 1;
        int res = 0;
        while(l < h){
            res = Math.max(res,(h - l) * Math.min(height[l],height[h]));
            if(height[l] < height[h]) l++;
            else h--;
        }
        return res;
    }
}
