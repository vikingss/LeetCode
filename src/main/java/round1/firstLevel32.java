package round1;

import java.util.LinkedList;
import java.util.Random;

/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2 输出： 2 解释： 有两种方法可以爬到楼顶。 1.  1 步 + 1 步 2.  2 步 示例 2：
 *
 * 输入： 3 输出： 3 解释： 有三种方法可以爬到楼顶。 1.  1 步 + 1 步 + 1 步 2.  1 步 + 2 步 3.  2 步 + 1 步
 */
public class firstLevel32 {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } else {
            int[] ways = new int[n + 1];
            ways[0] = 1;
            ways[1] = 1;
            for (int i = 2; i < n + 1; ++i) {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
            return ways[n];
        }
    }

    class MinStack {
        private LinkedList<Integer> min =null;
        private LinkedList<Integer> list = null;
        /** initialize your data structure here. */
        public MinStack() {
            min = new LinkedList<Integer>();
            list = new LinkedList<Integer>();
        }

        public void push(int x) {
            list.add(x);
            if(min.size() == 0 || x < min.get(min.size() - 1)){
                min.add(x);
            }else{
                min.add(min.size() - 1);
            }
        }

        public void pop() {
            list.removeLast();
            min.removeLast();
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int getMin() {
            return min.get(min.size() - 1);
        }
    }
}
