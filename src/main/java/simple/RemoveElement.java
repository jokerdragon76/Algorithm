package simple;

/**
 * @author jokerdragon
 *
 * 题目描述：给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 提示：同样使用双指针，一前一后两个指针效率比较高
 *
 * example:
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val){
                nums[left] = nums[right - 1];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }



}
