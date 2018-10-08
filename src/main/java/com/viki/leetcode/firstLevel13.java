package com.viki.leetcode;

/**

 给定一个 32 位有符号整数，将整数中的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
 示例 2:

 输入: -123
 输出: -321
 示例 3:

 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class firstLevel13 {
    public int reverse(int x) {
        int res = 0;
        while(x != 0){
            int val = x % 10;
            int tmp = res;
            res = tmp * 10 +  val;
            x  /= 10;
            if(res / 10 !=  tmp){
                return 0;
            }
        }
        return res;
    }
}
