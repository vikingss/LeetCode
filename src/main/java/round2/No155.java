package round2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:35 2018/10/23
 * @Modified By:
 */
public class No155 {
    class MinStack {
        private Deque<Integer> minStack;
        private Deque<Integer> list;
        /** initialize your data structure here. */
        public MinStack() {
            minStack = new LinkedList<>();
            list = new LinkedList<>();
        }

        public void push(int x) {
            list.push(x);
            if(minStack.peek() == null || minStack.peek() > x) minStack.push(x);
            else minStack.push(minStack.peek());
        }

        public void pop() {
            if(!list.isEmpty()){
                list.pop();
                minStack.pop();
            }
        }

        public int top() {
            return list.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
