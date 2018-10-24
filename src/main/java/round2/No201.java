package round2;

public class No201 {
    public int rangeBitwiseAnd(int m, int n) {
        //保留m和n的相同部分,剩下的部分补0
        int i = 0;
        while(m != n){
            m = m >> 1;
            n = n >> 1;
            i++;
        }
        return n << i;// or m << i;
    }
}
