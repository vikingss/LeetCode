package com.viki.leetcode;

import java.util.LinkedList;

/**
 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

 push(x) -- 将元素 x 推入栈中。
 pop() -- 删除栈顶的元素。
 top() -- 获取栈顶元素。
 getMin() -- 检索栈中的最小元素。
 示例:

 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> 返回 -3.
 minStack.pop();
 minStack.top();      --> 返回 0.
 minStack.getMin();   --> 返回 -2.
 */
public class firstLevel33 {
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
                min.add(min.get(min.size() - 1));
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
