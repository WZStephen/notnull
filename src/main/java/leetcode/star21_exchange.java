package leetcode;

/**
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class star21_exchange {
    public int[] exchange(int[] nums){
        int left_index = 0, right_index = nums.length-1;
        while(left_index < right_index){
            if((nums[left_index] & 1) != 0){
                left_index++;
                continue;
            }
            if((nums[right_index] & 1) != 1){
                right_index--;
                continue;
            }
            swap(nums[left_index++], nums[right_index--], nums);
        }
        return nums;
    }

    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        star21_exchange obj = new star21_exchange();
        obj.exchange(new int[]{1,2,3,4,5});
    }
}
