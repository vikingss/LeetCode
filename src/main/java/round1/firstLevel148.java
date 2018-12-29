package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:43 2018/9/29
 * @Modified By:
 */
public class firstLevel148 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0;i < gas.length; ++i){
            sum += gas[i] - cost[i];
        }
        if(sum < 0) return -1;


        int tank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; ++i){
            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        return start;
    }
}
