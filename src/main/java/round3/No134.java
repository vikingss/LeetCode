package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:37 2018/11/2
 * @Modified By:
 */
public class No134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0; i < gas.length; ++i){
            sum += gas[i] - cost[i];
        }
        if(sum < 0) return -1;

        int tank = 0;
        int start = 0;
        for(int i = start; i < gas.length; ++i){
            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }
        return start;
    }
}
