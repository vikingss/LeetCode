package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:36 2018/10/26
 * @Modified By:
 */
public class No11 {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;
        int res = 0;
        int l = 0,h = height.length - 1;
        while(l < h){
            res = Math.max(res,(h - l) * Math.min(height[l],height[h]));
            if(height[l] < height[h]) l++;//l的高度小，就换个高度，看看能不能变大点
            else h--;
        }
        return res;
    }
}
