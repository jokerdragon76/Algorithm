package simple;

/**
 * @author jokerdragon
 *
 * 题目描述：
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * example:
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 *
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {


        int n = digits.length;

        for (int i = n-1; i >= 0; i--){

            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            };

        }


        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;


    }

}
