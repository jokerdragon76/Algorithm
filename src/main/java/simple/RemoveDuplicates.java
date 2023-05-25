package simple;

/**
 * @author jokerdragon
 *
 * 题目描述：给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 *  题目提示 : 采用双指针方法
 *
 *  example:
 *  输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0){
        return 0;
        }
        int fast = 1,slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast-1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
